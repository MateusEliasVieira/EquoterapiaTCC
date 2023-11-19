package com.equoterapia.domain.model.patient;

import com.equoterapia.domain.enums.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PatientEducation {

    // Escolaridade do paciente

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPatientEducation;
    private String schoolGradee;
    private SchoolClass schoolClass;
    private String educationalInstitution;
    private TypeOfEducationalInstitution typeOfEducationalInstitution;
    private Period period;

    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

}
