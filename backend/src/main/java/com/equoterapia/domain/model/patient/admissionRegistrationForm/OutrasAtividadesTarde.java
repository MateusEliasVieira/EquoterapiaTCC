package com.equoterapia.domain.model.patient.admissionRegistrationForm;

import com.equoterapia.domain.model.patient.Patient;
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
public class OtherActivitiesAfternoon {

    // Cronograma de atividade do paciente em outras instituições período vespertino

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOtherActivitiesMorning;
    private String monday;
    private String tuesday;
    private String wednesday;
    private String thursday;
    private String friday;
    private String saturday;
    private String sunday;

    @OneToOne
    @JoinColumn(name = "admissionRegistrationForm_id")
    private AdmissionRegistrationForm admissionRegistrationForm;

}
