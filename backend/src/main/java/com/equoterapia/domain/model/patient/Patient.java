package com.equoterapia.domain.model.patient;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Patient implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPatient;

    private Date assessmentDate; // data da avaliação

    @OneToOne(mappedBy = "patient")
    private PersonalData personalData;

    @OneToOne(mappedBy = "patient")
    private PatientEducation patientEducation;

    @OneToOne(mappedBy = "patient")
    private ResponsiblePatient responsiblePatient;

    @OneToOne(mappedBy = "patient")
    private OtherActivitiesMorning otherActivitiesMorning;
    @OneToOne(mappedBy = "patient")
    private OtherActivitiesAfternoon otherActivitiesAfternoon;
    private String observation; // sobre horario desejado das sessões de equoterapia

    @OneToOne(mappedBy = "patient")
    private Emergency emergency;

    @OneToOne(mappedBy = "patient")
    private CompletionEnrollment completionEnrollment;

    @OneToOne(mappedBy = "patient")
    private PsychologicalAssessment psychologicalAssessment;

    @OneToOne(mappedBy = "patient")
    private PhysicalTherapyAssessment physicalTherapyAssessment;

    // continue...
}
