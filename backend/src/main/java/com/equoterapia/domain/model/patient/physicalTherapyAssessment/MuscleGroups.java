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
public class MuscleGroups {

    // Grupos Musculares e Escala de Ashworth Modificada (Muscle Groups and Modified Ashworth Scale)

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMuscleGroups;
    private String rightShoulderFlexors;
    private String leftShoulderFlexors;
    private String rightShoulderExtensors;
    private String leftShoulderExtensors;
    private String rightElbowFlexors;
    private String leftElbowFlexors;
    private String rightElbowExtensors;
    private String leftElbowExtensors;
    private String rightWristFlexors;
    private String leftWristFlexors;
    private String rightWristExtensors;
    private String leftWristExtensors;
    private String rightHipFlexors;
    private String leftHipFlexors;
    private String rightHipExtensors;
    private String leftHipExtensors;
    private String rightKneeFlexors;
    private String leftKneeFlexors;
    private String rightAnkleDorsiflexors;
    private String leftAnkleDorsiflexors;
    private String rightAnklePlantarflexor;
    private String leftAnklePlantarflexor;

    @OneToOne
    @JoinColumn(name = "physicalTherapyAssessment_id")
    private PhysicalTherapyAssessment physicalTherapyAssessment;

}
