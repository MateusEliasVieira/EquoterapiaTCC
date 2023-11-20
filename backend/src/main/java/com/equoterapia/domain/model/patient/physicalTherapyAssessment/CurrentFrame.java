package com.equoterapia.domain.model.patient.physicalTherapyAssessment;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CurrentFrame {

    // Quadro atual

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCurrentFrame;
    @NotBlank
    private String currentLocomotion;
    @NotBlank
    private String restrictions;
    @NotBlank
    private String deformities;

    @OneToOne
    @JoinColumn(name = "physicalTherapyAssessment_id")
    private PhysicalTherapyAssessment physicalTherapyAssessment;

}
