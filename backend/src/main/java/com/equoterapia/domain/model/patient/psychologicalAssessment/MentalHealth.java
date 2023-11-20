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
public class MentalHealth {

    // Saúde mental

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMentalHealth;
    @Enumerated @NotNull
    private FillCaption presentsMentalConfusion;
    @Enumerated @NotNull
    private FillCaption presentsDelusions;
    @Enumerated @NotNull
    private FillCaption presentsHallucinations;

    @OneToOne
    @JoinColumn(name = "psychologicalAssessment_id")
    private PsychologicalAssessment psychologicalAssessment;

}
