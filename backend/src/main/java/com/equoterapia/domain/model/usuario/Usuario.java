package com.equoterapia.domain.model.usuario;

import com.equoterapia.domain.enums.EstadoCivil;
import com.equoterapia.domain.enums.Role;
import com.equoterapia.domain.enums.Vinculo;
import com.equoterapia.domain.model.paciente.Paciente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Usuario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    private String nome;
    private String foto;
    private Date dataNascimento;
    private String cpf;
    private EstadoCivil estadoCivil;
    private String telefone;
    private String email;
    private String nomeUsuario;
    private String senha;
    private String detalhesFormacao;
    private String cidade;
    private String bairro;
    private String logradouro;
    private Role role;
    private Vinculo vinculo;
    private Boolean possuiFormacao;
    private String token;
    private boolean status;
    private int tentativasLogin;
    private Date liberarLogin;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Paciente> listaPacientes;

}

