package com.equoterapia.domain.model.patient.admissionRegistrationForm;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static com.equoterapia.utils.Feedback.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Emergencia {

    // Emergência

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmergencia;
    @NotBlank(message = TELEFONE_EMERGENCIA)
    @Pattern(regexp = "\\(\\d{2}\\)\\d{5}-\\d{4}", message = FORMATO_TELEFONE)
    private String ligarPara;
    @NotBlank(message = TELEFONE)
    @Pattern(regexp = "\\(\\d{2}\\)\\d{5}-\\d{4}", message = FORMATO_TELEFONE)
    private String telefone;
    @NotNull
    private Boolean possuiPlanoDeSaude;
    private String plano; // Caso tenha, qual é?

    @OneToOne
    @JoinColumn(name = "id_ficha_cadastro_admissional")
    private FichaCadastroAdmissional fichaCadastroAdmissional;

}
