package com.equoterapia.domain.model.patient.admissionRegistrationForm;

import com.equoterapia.domain.model.patient.Patient;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

import static com.equoterapia.utils.Feedback.SIGNATURE_IMAGE;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CompletionEnrollment {

    // Sobre a efetivação da matrícula

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCompletionEnrollment;
    @NotBlank @NotNull @Size(min = 8, max = 10)
    private Date dateCompletionEnrollment;
    @NotBlank(message = SIGNATURE_IMAGE)
    private String imageSignatureResponsible;

    @OneToOne
    @JoinColumn(name = "admissionRegistrationForm_id")
    private AdmissionRegistrationForm admissionRegistrationForm;

}
