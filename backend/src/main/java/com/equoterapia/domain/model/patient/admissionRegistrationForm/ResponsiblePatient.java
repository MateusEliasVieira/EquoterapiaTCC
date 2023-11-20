package com.equoterapia.domain.model.patient.admissionRegistrationForm;

import com.equoterapia.domain.model.patient.Patient;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.NumberFormat;

import java.util.Date;

import static com.equoterapia.utils.Feedback.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ResponsiblePatient {

    // Responsável do paciente

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idResponsiblePatient;
    @NotBlank(message = NAME_RESPONSIBLE)
    private String nameResponsible;
    @NotBlank
    private String degreeKinship; // Parentesco
    @NotBlank
    private String profession;
    @NotBlank(message = PHONE)
    @Pattern(regexp = "\\(\\d{2}\\)\\d{5}-\\d{4}", message = PHONE_FORMAT)
    private String telephone;
    @NotBlank @NotNull @Size(min = 8, max = 10)
    private Date dateOfBirth;
    @Email @NotBlank(message = EMAIL)
    private String email;
    @NotBlank(message = WORK_PHONE)
    @Pattern(regexp = "\\(\\d{2}\\)\\d{5}-\\d{4}", message = PHONE_FORMAT)
    private String workPhone;
    private Double familyIncome;

    @OneToOne
    @JoinColumn(name = "admissionRegistrationForm_id")
    private AdmissionRegistrationForm admissionRegistrationForm;

}
