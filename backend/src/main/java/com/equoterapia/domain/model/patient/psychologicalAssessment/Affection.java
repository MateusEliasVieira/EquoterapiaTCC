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
public class Affection {

    // Afetividade

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAffection;
    @Enumerated @NotNull
    private FillCaption showsSpecialAffectionForSomeone;
    @Enumerated @NotNull
    private FillCaption shareYourThings;
    @Enumerated @NotNull
    private FillCaption helpWhenAsked;
    @Enumerated @NotNull
    private FillCaption expressionFeelings;

    @OneToOne
    @JoinColumn(name = "psychologicalAssessment_id")
    private PsychologicalAssessment psychologicalAssessment;

}
