package com.equoterapia.domain.model.patient.admissionRegistrationForm;

import com.equoterapia.domain.enums.*;
import com.equoterapia.domain.model.patient.Patient;
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
public class PatientEducation {

    // Escolaridade do paciente

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPatientEducation;
    @NotBlank
    private String schoolGradee;
    @Enumerated
    private SchoolClass schoolClass;
    @NotBlank
    private String educationalInstitution;
    @Enumerated
    private TypeOfEducationalInstitution typeOfEducationalInstitution;
    @Enumerated
    private Period period;

    @OneToOne
    @JoinColumn(name = "admissionRegistrationForm_id")
    private AdmissionRegistrationForm admissionRegistrationForm;

}
