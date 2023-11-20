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
public class FormOfCommunication {

    // Forma de comunicação

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFormOfCommunication;
    @NotNull
    private Boolean speech;
    @NotBlank
    private String speechConsiderations;
    @NotNull
    private Boolean gestures;
    @NotBlank
    private String gesturesConsiderations;
    @NotNull
    private Boolean useOfEyes;
    @NotBlank
    private String useOfEyesConsiderations;

    @OneToOne
    @JoinColumn(name = "physicalTherapyAssessment_id")
    private PhysicalTherapyAssessment physicalTherapyAssessment;

}
