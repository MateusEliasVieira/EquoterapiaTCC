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
public class Emergency {

    // Emergência

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmergency;
    private String callTo;
    private String telephone;
    private Boolean haveHealthPlan; // Plano de saúde
    private String plan; // Caso tenha, qual é?

    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

}
