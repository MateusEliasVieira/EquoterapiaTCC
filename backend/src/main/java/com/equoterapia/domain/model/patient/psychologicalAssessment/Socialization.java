package com.equoterapia.domain.model.patient.psychologicalAssessment;

import com.equoterapia.domain.enums.FillCaption;
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
public class Socialization {

    // Socialização

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSocialization;
    @Enumerated @NotBlank
    private FillCaption interactsWellWithOtherChildrens;
    @Enumerated @NotBlank
    private FillCaption interactsWellWithAdults;
    @Enumerated @NotBlank
    private FillCaption seeksSocialContact;
    @Enumerated @NotBlank
    private FillCaption haveOpportunityContact;
    @Enumerated @NotBlank
    private FillCaption makesEyeContact;

    @OneToOne
    @JoinColumn(name = "psychologicalAssessment_id")
    private PsychologicalAssessment psychologicalAssessment;

}
