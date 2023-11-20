package com.equoterapia.domain.model.patient.physicalTherapyAssessment;

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
public class JointMobility {

    // Mobilidade articular

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idJointMobility;

    // Ombro (Shoulder)
    private String shoulderActiveFlexion;
    private String shoulderPassiveFlexion;
    private String shoulderActiveAbduction;

    private String shoulderPassiveAbduction;
    private String shoulderActiveAdduction;
    private String shoulderPassiveAdduction;

    // Cotovelo (Elbow)
    private String elbowActiveFlexion;
    private String elbowPassiveFlexion;
    private String elbowActiveExtension;
    private String elbowPassiveExtension;

    // Quadril (Hip)
    private String hipActiveFlexion;
    private String hipPassiveFlexion;
    private String hipActiveExtension;
    private String hipPassiveExtension;
    private String hipActiveAdduction;
    private String hipPassiveAdduction;
    private String hipActiveAbduction;
    private String hipPassiveAbduction;
    private String hipActiveInternalRotation;
    private String hipPassiveInternalRotation;
    private String hipActiveExternalRotation;
    private String hipPassiveExternalRotation;

    // Joelho (Knee)
    private String kneeActiveExtension;
    private String kneePassiveExtension;
    private String kneeActiveFlexion;
    private String kneePassiveFlexion;

    // Tornozelo (Ankle)
    private String ankleActiveDorsiflexion;
    private String anklePassiveDorsiflexion;
    private String ankleActivePlantarflexion;
    private String anklePassivePlantarflexion;

    @OneToOne
    @JoinColumn(name = "physicalTherapyAssessment_id")
    private PhysicalTherapyAssessment physicalTherapyAssessment;
}
