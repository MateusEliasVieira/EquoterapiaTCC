package com.equoterapia.domain.model.patient;

import jakarta.persistence.*;
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
    private Date planningDate;
    private String therapeuticResponsible;
    private String issue;
    private String hypothesesJustifyBiologicalSocialEmotionalIssue;
    private String therapeuticGoal;
    private String measurement;
    private String interventionStrategies;
    private String animalMediatorsSaddling;
    private String howIsItEvolving;
    private String therapistsSignatureStampImage;

    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
}
