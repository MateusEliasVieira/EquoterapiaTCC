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
public class Language {

    // Linguagem

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLanguage;
    @Enumerated @NotNull
    private FillCaption understandingVerbal;
    @Enumerated @NotNull
    private FillCaption gesture;
    @Enumerated @NotNull
    private FillCaption screams; // Gritos
    @Enumerated @NotNull
    private FillCaption facialMimicry; // Mímica facial
    @Enumerated @NotNull
    private FillCaption monosyllables;
    @Enumerated @NotNull
    private FillCaption shortSentences;
    @Enumerated @NotNull
    private FillCaption completeSentences;

    @OneToOne
    @JoinColumn(name = "psychologicalAssessment_id")
    private PsychologicalAssessment psychologicalAssessment;

}
