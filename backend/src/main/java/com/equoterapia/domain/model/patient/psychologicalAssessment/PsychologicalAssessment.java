package com.equoterapia.domain.model.patient.psychologicalAssessment;

import com.equoterapia.domain.model.patient.Patient;
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
public class PsychologicalAssessment {

    // Avaliação dos aspectos psicológicos

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPsychologicalAssessment;

    @OneToOne(mappedBy = "psychologicalAssessment")
    private AboutTheChild aboutTheChild;

    @OneToOne(mappedBy = "psychologicalAssessment")
    private Health health;

    @OneToOne(mappedBy = "psychologicalAssessment")
    private Routine routine;

    @OneToOne(mappedBy = "psychologicalAssessment")
    private PersonalityTraits personalityTraits;

    @OneToOne(mappedBy = "psychologicalAssessment")
    private Language language;

    @OneToOne(mappedBy = "psychologicalAssessment")
    private Understanding understanding;

    @OneToOne(mappedBy = "psychologicalAssessment")
    private MentalHealth mentalHealth;

    @OneToOne(mappedBy = "psychologicalAssessment")
    private Socialization socialization;

    @OneToOne(mappedBy = "psychologicalAssessment")
    private Behavior behavior;

    @OneToOne(mappedBy = "psychologicalAssessment")
    private SocialSkills socialSkills;

    @OneToOne(mappedBy = "psychologicalAssessment")
    private Affection affection;

    @OneToOne(mappedBy = "psychologicalAssessment")
    private FamilyRelationshipExaminee familyRelationshipExaminee;

    private String familyExpectationsEquineTherapy;
    private String caseSummaryComplementaryObservations;

    private String imageSignatureOrCRPAndStamp;

    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

}
