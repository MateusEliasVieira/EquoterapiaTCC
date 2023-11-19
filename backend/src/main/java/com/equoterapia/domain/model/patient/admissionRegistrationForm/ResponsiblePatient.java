package com.equoterapia.domain.model.patient;

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
public class ResponsiblePatient {

    // Responsável do paciente

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idResponsiblePatient;
    private String nameResponsible;
    private String degreeKinship; //parentesco
    private String profession;
    private String telephone;
    private Date dateOfBirth;
    private String email;
    private String workPhone;
    private Double familyIncome;

    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

}
