package com.equoterapia.domain.model.patient;

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
public class OtherActivitiesMorning {

    // Cronograma de atividade do paciente em outras instituições período matutino

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
    @JoinColumn(name = "patient_id")
    private Patient patient;

}
