package com.equoterapia.domain.model.patient.psychologicalAssessment;

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
public class Routine {

    // Rotina

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRoutine;
    @NotBlank
    private String pranks;
    @NotBlank
    private String preferences; // Preferências por brincadeiras
    @NotBlank
    private Boolean acceptChangesRoutine;
    @NotBlank
    private String considerationsAboutRoutine;

    @OneToOne
    @JoinColumn(name = "psychologicalAssessment_id")
    private PsychologicalAssessment psychologicalAssessment;

}
