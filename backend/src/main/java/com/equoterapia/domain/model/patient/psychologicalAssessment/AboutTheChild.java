package com.equoterapia.domain.model.patient.psychologicalAssessment;

import com.equoterapia.domain.model.patient.Patient;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
public class AboutTheChild {

    // Perguntas iniciais sobre a criança

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAboutTheChild;
    @NotNull
    private Boolean didEquineTherapy;
    @NotNull
    private Boolean plannedChild;
    @NotNull
    private Boolean prenatalCare;
    @NotNull
    private Boolean criedAtBirth;
    private String food;
    private String observation;

    @OneToOne
    @JoinColumn(name = "psychologicalAssessment_id")
    private PsychologicalAssessment psychologicalAssessment;

}
