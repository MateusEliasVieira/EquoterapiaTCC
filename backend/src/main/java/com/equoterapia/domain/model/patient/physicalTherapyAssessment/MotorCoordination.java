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
public class MotorCoordination {

    // Coordenação Motora (Motor Coordination)

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDynamicBalance;
    @NotNull
    private Boolean handObjectTest;
    @NotBlank
    private String handObjectTestConsiderations;
    @NotNull
    private Boolean unilateralIndexNose;
    @NotBlank
    private String unilateralIndexNoseConsiderations;
    @NotNull
    private Boolean indexIndexTest;
    @NotBlank
    private String indexIndexTestConsiderations;
    @NotNull
    private Boolean alternateMovements;
    @NotBlank
    private String alternateMovementsConsiderations;
    @NotNull
    private Boolean reachGraspTest;
    @NotBlank
    private String reachGraspTestConsiderations;

    @OneToOne
    @JoinColumn(name = "physicalTherapyAssessment_id")
    private PhysicalTherapyAssessment physicalTherapyAssessment;

}
