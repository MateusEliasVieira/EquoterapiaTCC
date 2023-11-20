package com.equoterapia.domain.model.patient.psychologicalAssessment;

import com.equoterapia.domain.enums.FillCaption;
import jakarta.persistence.*;
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
public class FamilyRelationshipExaminee {

    // Relação da família com o examinado (percepção do entrevistador)

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFamilyRelationshipExaminee;
    @Enumerated @NotNull
    private FillCaption proper; // Adequado
    @Enumerated @NotNull
    private FillCaption overprotection;
    @Enumerated @NotNull
    private FillCaption difficultyNoticingDeficiencies;
    @Enumerated @NotNull
    private FillCaption rejection;
    @Enumerated @NotNull
    private FillCaption indifference;
    @Enumerated @NotNull
    private FillCaption anxietyPerceivedExaminer; // Ansiedade percebida pelo examinador

    @OneToOne
    @JoinColumn(name = "psychologicalAssessment_id")
    private PsychologicalAssessment psychologicalAssessment;

}
