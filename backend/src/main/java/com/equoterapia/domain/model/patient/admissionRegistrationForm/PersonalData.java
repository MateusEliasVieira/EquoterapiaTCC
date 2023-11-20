package com.equoterapia.domain.model.patient.admissionRegistrationForm;

import com.equoterapia.domain.enums.BloodType;
import com.equoterapia.domain.enums.ColorOrRace;
import com.equoterapia.domain.enums.Sex;
import com.equoterapia.domain.model.patient.Patient;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

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
    @NotBlank
    private String fullName;
    @NotBlank
    private String clinicalDiagnosis;
    @NotBlank
    private String chiefComplaint; // Queixa principal (EX: dificuldade de concentração)
    @NotBlank
    private String CID;
    @NotBlank @NotNull @Size(min = 8, max = 10)
    private Date dateOfBirth;
    @NotNull
    private Double weight;
    @Enumerated
    private BloodType bloodType;
    @NotBlank
    private String RHFactor;
    @NotNull
    private Double height;
    @Enumerated
    private Sex sex;
    @NotBlank
    private String naturalness;
    @Enumerated
    private ColorOrRace colorOrRace;
    @CPF @NotBlank
    private String CPF;
    @NotBlank
    private String SUSCard;
    @NotBlank
    private String homeAddress;
    @NotBlank
    private String neighborhood;
    @NotBlank
    private String city;
    @NotBlank @Size(min = 8, max = 9)
    private String CEP;

    @OneToOne
    @JoinColumn(name = "admissionRegistrationForm_id")
    private AdmissionRegistrationForm admissionRegistrationForm;

}
