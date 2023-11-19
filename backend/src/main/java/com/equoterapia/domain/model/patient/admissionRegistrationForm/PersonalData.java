package com.equoterapia.domain.model.patient;

import com.equoterapia.domain.enums.BloodType;
import com.equoterapia.domain.enums.ColorOrRace;
import com.equoterapia.domain.enums.Sex;
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
public class PersonalData implements Serializable {

    // Dados Pessoais do Praticante

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersonalData;
    private String fullName;
    private String clinicalDiagnosis;
    private String chiefComplaint; // Queixa principal (EX: dificuldade de concentração)
    private String CID;
    private Date dateOfBirth;
    private Double weight;
    private BloodType bloodType;
    private String RHFactor;
    private Double height;
    private Sex sex;
    private String naturalness;
    private ColorOrRace colorOrRace;
    private String CPF;
    private String SUSCard;
    private String homeAddress;
    private String neighborhood;
    private String city;
    private String CEP;

    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

}
