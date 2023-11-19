package com.equoterapia.domain.model.patient;

import com.equoterapia.domain.model.Patient;
import com.equoterapia.domain.model.patient.physicalTherapyAssessment.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PhysicalTherapyAssessment {

    // Avaliação Fisioterapêutica

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPhysicalTherapyAssessment;

    private String physiotherapeuticDiagnosis;
    private String pregnancyHistory;

    @OneToOne(mappedBy = "physicalTherapyAssessment")
    private GeneralHealthOfPatients generalHealthOfPatients;

    @OneToOne(mappedBy = "physicalTherapyAssessment")
    private FormOfCommunication formOfCommunication;

    @OneToOne(mappedBy = "physicalTherapyAssessment")
    private CurrentFrame currentFrame;

    @OneToOne(mappedBy = "physicalTherapyAssessment")
    private JointMobility jointMobility;

    @OneToOne(mappedBy = "physicalTherapyAssessment")
    private MuscleGroups muscleGroups;

    @OneToOne(mappedBy = "physicalTherapyAssessment")
    private StaticBalanceClass staticBalanceClass;

    @OneToOne(mappedBy = "physicalTherapyAssessment")
    private DynamicBalance dynamicBalance;

    @OneToOne(mappedBy = "physicalTherapyAssessment")
    private MotorSkillsADL motorSkillsADL;

    @OneToOne(mappedBy = "physicalTherapyAssessment")
    private MotorCoordination motorCoordination;

    // Descrever Tonus Muscular (Describe Muscle Tone)
    private String muscleTone;

    // Conclusão/Indicação para Equoterapia (Conclusion/Indication for Hippotherapy)
    private String conclusionIndicationForHippotherapy;

    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

}

