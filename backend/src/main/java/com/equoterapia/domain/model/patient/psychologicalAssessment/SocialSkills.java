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
public class SocialSkills {

    // Habilidades sociais

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSocialSkills;
    @Enumerated @NotBlank
    private FillCaption passivity;
    @Enumerated @NotBlank
    private FillCaption selfAggression;
    @Enumerated @NotBlank
    private FillCaption heteroAggressiveness;
    @Enumerated @NotBlank
    private FillCaption assertiveness;

    @OneToOne
    @JoinColumn(name = "psychologicalAssessment_id")
    private PsychologicalAssessment psychologicalAssessment;

}
