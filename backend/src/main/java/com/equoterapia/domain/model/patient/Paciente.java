package com.equoterapia.domain.model.patient;

import com.equoterapia.domain.model.User;
import com.equoterapia.domain.model.patient.admissionRegistrationForm.*;
import com.equoterapia.domain.model.patient.physicalTherapyAssessment.PhysicalTherapyAssessment;
import com.equoterapia.domain.model.patient.psychologicalAssessment.PsychologicalAssessment;
import com.equoterapia.domain.model.patient.uniqueTherapeuticPlan.UniqueTherapeuticPlan;
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
public class Patient {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPatient;

    @OneToOne(mappedBy = "patient")
    private AdmissionRegistrationForm admissionRegistrationForm;

    @OneToOne(mappedBy = "patient")
    private PsychologicalAssessment psychologicalAssessment;

    @OneToOne(mappedBy = "patient")
    private PhysicalTherapyAssessment physicalTherapyAssessment;

    @OneToOne(mappedBy = "patient")
    private UniqueTherapeuticPlan uniqueTherapeuticPlan;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
