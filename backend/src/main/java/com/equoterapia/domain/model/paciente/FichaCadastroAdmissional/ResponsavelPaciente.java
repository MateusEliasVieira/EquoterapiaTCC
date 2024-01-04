package com.equoterapia.domain.model.paciente.FichaCadastroAdmissional;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

import static com.equoterapia.utils.Feedback.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ResponsavelPaciente {

    // Responsável do paciente

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idResponsavelPaciente;
    @NotBlank(message = NOME_RESPONSAVEL)
    private String nomeResponsavel;
    @NotBlank
    private String grauParentesco; // Parentesco
    @NotBlank
    private String profissao;
    @NotBlank(message = TELEFONE)
    @Pattern(regexp = "\\(\\d{2}\\)\\d{5}-\\d{4}", message = FORMATO_TELEFONE)
    private String telefone;
    @NotBlank @NotNull @Size(min = 8, max = 10)
    private Date dataNascimento;
    @Email @NotBlank(message = EMAIL)
    private String email;
    @NotBlank(message = TELEFONE_TRABALHO)
    @Pattern(regexp = "\\(\\d{2}\\)\\d{5}-\\d{4}", message = FORMATO_TELEFONE)
    private String telefoneTrabalho;
    private Double rendaFamiliar;

    @OneToOne
    @JoinColumn(name = "ficha_cadastro_admissional_id")
    private FichaCadastroAdmissional fichaCadastroAdmissional;

}

