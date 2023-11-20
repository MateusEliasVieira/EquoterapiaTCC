package com.equoterapia.domain.model.patient.admissionRegistrationForm;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static com.equoterapia.utils.Feedback.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Emergency {

    // Emergência

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmergency;
    @NotBlank(message = EMERGENCY_PHONE)
    @Pattern(regexp = "\\(\\d{2}\\)\\d{5}-\\d{4}", message = PHONE_FORMAT)
    private String callTo;
    @NotBlank(message = PHONE)
    @Pattern(regexp = "\\(\\d{2}\\)\\d{5}-\\d{4}", message = PHONE_FORMAT)
    private String telephone;
    @NotNull
    private Boolean haveHealthPlan; // Plano de saúde
    private String plan; // Caso tenha, qual é?

    @OneToOne
    @JoinColumn(name = "admissionRegistrationForm_id")
    private AdmissionRegistrationForm admissionRegistrationForm;

}
