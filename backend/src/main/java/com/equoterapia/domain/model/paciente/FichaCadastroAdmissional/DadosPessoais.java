package com.equoterapia.domain.model.paciente.FichaCadastroAdmissional;

import com.equoterapia.domain.enums.CorOuRaca;
import com.equoterapia.domain.enums.Sexo;
import com.equoterapia.domain.enums.TipoSanguineo;
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

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDadosPessoais;
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    private String diagnosticoClinico;
    @NotBlank
    private String queixaPrincipal; // Queixa principal (EX: dificuldade de concentração)
    @NotBlank
    private String CID;
    @NotBlank @NotNull @Size(min = 8, max = 10)
    private Date dataNascimento;
    @NotNull
    private Double peso;
    @Enumerated
    private TipoSanguineo tipoSanguineo;
    @NotBlank
    private String fatorRH;
    @NotNull
    private Double altura;
    @Enumerated
    private Sexo sexo;
    @NotBlank
    private String naturalidade;
    @Enumerated
    private CorOuRaca corOuRaca;
    @CPF @NotBlank
    private String CPF;
    @NotBlank
    private String cartaoSUS;
    @NotBlank
    private String enderecoResidencial;
    @NotBlank
    private String bairro;
    @NotBlank
    private String cidade;
    @NotBlank @Size(min = 8, max = 9)
    private String CEP;

    @OneToOne
    @JoinColumn(name = "ficha_cadastro_admissional_id")
    private FichaCadastroAdmissional fichaCadastroAdmissional;

}

