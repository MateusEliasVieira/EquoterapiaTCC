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
public class PersonalityTraits {

    // Traços de personalidade

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersonalityTraits;
    @Enumerated @NotNull
    private FillCaption extroversion;
    @Enumerated @NotNull
    private FillCaption phobia;
    @Enumerated @NotNull
    private FillCaption obsession;
    @Enumerated @NotNull
    private FillCaption introversion;
    @Enumerated @NotNull
    private FillCaption anxiety;
    @Enumerated @NotNull
    private FillCaption hysteria;
    @Enumerated @NotNull
    private FillCaption emotionalDependence;
    @Enumerated @NotNull
    private FillCaption shyness; // Timidez

    @OneToOne
    @JoinColumn(name = "psychologicalAssessment_id")
    private PsychologicalAssessment psychologicalAssessment;

}
