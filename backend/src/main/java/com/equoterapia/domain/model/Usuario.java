package com.equoterapia.domain.model;

import com.equoterapia.domain.enums.EstadoCivil;
import com.equoterapia.domain.enums.Role;
import com.equoterapia.domain.enums.Vinculo;
import com.equoterapia.domain.model.paciente.Paciente;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;
import java.util.Date;
import java.util.List;

import static com.equoterapia.utils.Feedback.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Usuario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    @NotBlank(message = NOME_COMPLETO) @Size(min = 4)
    private String nome;
    @Column(columnDefinition = "text", nullable = true)
    private String foto;
    @NotBlank(message = DATA_NASCIMENTO) @Size(min = 8, max = 10)
    private Date dataNascimento;
    @NotBlank @CPF
    private String cpf;
    @NotBlank(message = ESTADO_CIVIL)
    private EstadoCivil estadoCivil;
    @NotBlank(message = TELEFONE)
    private String telefone;
    @NotBlank @Email
    private String email;
    @NotBlank(message = NOME_USUARIO) @Size(min = 6, max = 50)
    private String nomeUsuario;
    @NotBlank(message = SENHA) @Size(min = 6, max = 100)
    private String senha;
    @NotNull(message = FORMACAO) @Column(columnDefinition = "text")
    private String detalhesFormacao;
    @NotBlank(message = CIDADE)
    private String cidade;
    @NotBlank(message = BAIRRO)
    private String bairro;
    @NotBlank(message = LOGRADOURO)
    private String logradouro;
    @NotNull(message = TIPO_ROLE)
    private Role role;
    @NotNull(message = VINCULO)
    private Vinculo vinculo;
    @NotNull(message = POSSUI_FORMACAO)
    private Boolean possuiFormacao;
    @Column(columnDefinition = "text") @NotBlank
    private String token;
    private boolean status;
    private int tentativasLogin;
    private Date liberarLogin;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Paciente> listaPacientes;

}

