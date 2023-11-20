package com.equoterapia.domain.model.patient.physicalTherapyAssessment;

import com.equoterapia.domain.enums.StaticBalance;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StaticBalanceClass {

    // Equilíbrio Estático (Static Balance)

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStaticBalanceClass;
    @Enumerated @NotNull
    private StaticBalance headSupport;
    @NotBlank
    private String headSupportComments;
    @Enumerated @NotNull
    private StaticBalance sitWithoutSupport;
    @NotBlank
    private String sitWithoutSupportComments;
    @Enumerated @NotNull
    private StaticBalance sitWithSupport;
    @NotBlank
    private String sitWithSupportComments;
    @Enumerated @NotNull
    private StaticBalance standingWithoutSupport;
    @NotBlank
    private String standingWithoutSupportComments;
    @Enumerated @NotNull
    private StaticBalance standingWithSupport;
    @NotBlank
    private String standingWithSupportComments;
    @Enumerated @NotNull
    private StaticBalance militaryPositionEyesOpen;
    @NotBlank
    private String militaryPositionEyesOpenComments;
    @Enumerated @NotNull
    private StaticBalance militaryPositionEyesClosed;
    @NotBlank
    private String militaryPositionEyesClosedComments;
    @Enumerated @NotNull
    private StaticBalance oneFootEyesOpen;
    @NotBlank
    private String oneFootEyesOpenComments;
    @Enumerated @NotNull
    private StaticBalance oneFootEyesClosed;
    @NotBlank
    private String oneFootEyesClosedComments;

    @OneToOne
    @JoinColumn(name = "physicalTherapyAssessment_id")
    private PhysicalTherapyAssessment physicalTherapyAssessment;

}
