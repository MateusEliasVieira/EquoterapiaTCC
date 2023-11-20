package com.equoterapia.domain.model.patient.admissionRegistrationForm;

import com.equoterapia.domain.model.patient.Patient;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AdmissionRegistrationForm {

    // Ficha Cadastral - Admissional CE

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdmissionRegistrationForm;
    private Date assessmentDate; // Data da avaliação

    @OneToOne(mappedBy = "admissionRegistrationForm")
    private PersonalData personalData;

    @OneToOne(mappedBy = "admissionRegistrationForm")
    private PatientEducation patientEducation;

    @OneToOne(mappedBy = "admissionRegistrationForm")
    private ResponsiblePatient responsiblePatient;

    @OneToOne(mappedBy = "admissionRegistrationForm")
    private OtherActivitiesMorning otherActivitiesMorning;

    @OneToOne(mappedBy = "admissionRegistrationForm")
    private OtherActivitiesAfternoon otherActivitiesAfternoon;

    private String observation; // Sobre horario desejado das sessões de equoterapia

    @OneToOne(mappedBy = "admissionRegistrationForm")
    private Emergency emergency;

    @OneToOne(mappedBy = "admissionRegistrationForm")
    private CompletionEnrollment completionEnrollment;

    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
}
