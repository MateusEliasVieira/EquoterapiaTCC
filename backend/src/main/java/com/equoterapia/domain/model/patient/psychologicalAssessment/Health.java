package com.equoterapia.domain.model.patient.psychologicalAssessment;

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
public class Health {

    // Saúde

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHealth;
    @NotBlank
    private String allergies;
    @NotBlank
    private String convulsions;
    @NotBlank
    private String illnesses; // Doenças
    @NotBlank
    private String digestion;
    @NotBlank
    private String eatingDisorder; // Transtorno alimentar
    @NotBlank
    private String breathing; // Respiração
    @NotBlank
    private String sleep;
    @NotBlank
    private String cognitiveDeficit;

    @OneToOne
    @JoinColumn(name = "psychologicalAssessment_id")
    private PsychologicalAssessment psychologicalAssessment;

}
