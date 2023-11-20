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
public class Behavior {

    // Comportamento

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBehavior;
    @Enumerated @NotNull
    private FillCaption agitation;
    @Enumerated @NotNull
    private FillCaption toleranceFrustration;
    @Enumerated @NotNull
    private FillCaption respectsLimitsRules;
    @Enumerated @NotNull
    private FillCaption opposition;
    @Enumerated @NotNull
    private FillCaption attentionConcentration;

    @OneToOne
    @JoinColumn(name = "psychologicalAssessment_id")
    private PsychologicalAssessment psychologicalAssessment;

}
