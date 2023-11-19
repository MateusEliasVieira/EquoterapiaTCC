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
public class CompletionEnrollment {

    // Sobre a efetivação da matrícula

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCompletionEnrollment;
    private Date dateCompletionEnrollment;
    private String fullNameResponsiblePatient;
    private String imageSignatureResponsible;

    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

}
