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
public class PersonalCares {

    // Cuidados pessoais

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersonalCares;
    @Enumerated @NotNull
    private FillCaption personalHygieneYourself;
    @Enumerated @NotNull
    private FillCaption wearsClothesShoesAlone;
    @Enumerated @NotNull
    private FillCaption feedsAlone;

    @OneToOne
    @JoinColumn(name = "psychologicalAssessment_id")
    private PsychologicalAssessment psychologicalAssessment;

}
