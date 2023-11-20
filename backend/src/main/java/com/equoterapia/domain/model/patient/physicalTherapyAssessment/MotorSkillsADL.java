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
public class MotorSkillsADL {

    // Motricidade/AVD's (Motor Skills/ADLs)

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMotorSkillsADL;
    @NotNull
    private Boolean reachObjects;
    @NotBlank
    private String reachObjectsConsiderations;
    @NotNull
    private Boolean bimanualUse;
    @NotBlank
    private String bimanualUseConsiderations;
    @NotNull
    private Boolean selfFeeding;
    @NotBlank
    private String selfFeedingConsiderations;
    @NotNull
    private Boolean dressIndependently;
    @NotBlank
    private String dressIndependentlyConsiderations;
    @NotNull
    private Boolean graspObjects;
    @NotBlank
    private String graspObjectsConsiderations;
    @NotNull
    private Boolean limbNeglect;
    @NotBlank
    private String limbNeglectConsiderations;
    @NotNull
    private Boolean selfHygiene;
    @NotBlank
    private String selfHygieneConsiderations;
    @NotNull
    private Boolean walk;
    @NotBlank
    private String walkConsiderations;
    @NotNull
    private Boolean manualWriting;
    @NotBlank
    private String manualWritingConsiderations;

    @OneToOne
    @JoinColumn(name = "physicalTherapyAssessment_id")
    private PhysicalTherapyAssessment physicalTherapyAssessment;
}
