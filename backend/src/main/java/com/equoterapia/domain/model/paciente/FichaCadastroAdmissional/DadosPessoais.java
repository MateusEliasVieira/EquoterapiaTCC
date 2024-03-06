package com.equoterapia.domain.model.paciente.fichaCadastroAdmissional;

import com.equoterapia.domain.enums.CorOuRaca;
import com.equoterapia.domain.enums.Sexo;
import com.equoterapia.domain.enums.TipoSanguineo;
import com.equoterapia.domain.model.paciente.Paciente;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DadosPessoais {

    // Dados Pessoais do Praticante

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDadosPessoais;
    private String nomeCompleto;
    private String diagnosticoClinico;
    private String queixaPrincipal; // Queixa principal (EX: dificuldade de concentração)
<<<<<<< HEAD
    private String cid;
=======
    private String CID;
>>>>>>> 617bd977d20bfecdc5ed1efeaeea2248f0b8d649
    private Date dataNascimento;
    private Double peso;
    private TipoSanguineo tipoSanguineo;
    private String fatorRH;
    private Double altura;
    private Sexo sexo;
    private String naturalidade;
    private CorOuRaca corOuRaca;
<<<<<<< HEAD
    @Column(unique = true)
    private String cpf;
    @Column(unique = true)
=======
    private String CPF;
>>>>>>> 617bd977d20bfecdc5ed1efeaeea2248f0b8d649
    private String cartaoSUS;
    private String enderecoResidencial;
    private String bairro;
    private String cidade;
<<<<<<< HEAD
    private String cep;
=======
    private String CEP;
>>>>>>> 617bd977d20bfecdc5ed1efeaeea2248f0b8d649

    @OneToOne
    @JoinColumn(name = "paciente_id_fk")
    private Paciente paciente;

}

