package com.equoterapia.domain.model.patient.physicalTherapyAssessment;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class GeneralHealthOfPatients {

    // Saúde geral do paciente

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGeneralHealthOfPatients;
    @NotNull
    private Boolean priorSeizures;
    @NotBlank
    private String priorSeizuresConsiderations;
    @NotNull
    private Boolean currentSeizures;
    @NotBlank
    private String currentSeizuresConsiderations;
    @NotBlank
    private String currentSeizuresFrequency;
    @NotNull
    private Boolean medications;
    @NotBlank
    private String medicationsConsiderations;
    @NotNull
    private Boolean constipation;
    @NotBlank
    private String constipationConsiderations;
    @NotNull
    private Boolean sleep;
    @NotBlank
    private String sleepConsiderations;
    @NotNull
    private Boolean hearing;
    @NotBlank
    private String hearingConsiderations;
    @NotNull
    private Boolean vision;
    @NotBlank
    private String visionConsiderations;
    @NotNull
    private Boolean gastroesophagealReflux;
    @NotBlank
    private String gastroesophagealRefluxConsiderations;
    @NotNull
    private Boolean surgicalInterventions;
    @NotBlank
    private String surgicalInterventionsConsiderations;
    @NotNull
    private Boolean allergies;
    @NotBlank
    private String allergiesConsiderations;

    @OneToOne
    @JoinColumn(name = "physicalTherapyAssessment_id")
    private PhysicalTherapyAssessment physicalTherapyAssessment;

}
