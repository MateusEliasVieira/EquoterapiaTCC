package com.equoterapia.domain.model.patient.uniqueTherapeuticPlan;

import com.equoterapia.domain.model.patient.Patient;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UniqueTherapeuticPlan {

    // Plano Terapêutico Singular (PTS)

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniqueTherapeuticPlan;
    @NotBlank @NotNull @Size(min = 8, max = 10)
    private Date planningDate;
    @NotBlank
    private String therapeuticResponsible;
    @NotBlank
    private String issue;
    @NotBlank
    private String hypothesesJustifyBiologicalSocialEmotionalIssue;
    @NotBlank
    private String therapeuticGoal;
    @NotBlank
    private String measurement;
    @NotBlank
    private String interventionStrategies;
    @NotBlank
    private String animalMediatorsSaddling;
    @NotBlank
    private String howIsItEvolving;
    @NotBlank
    private String therapistsSignatureStampImage;

    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

}
