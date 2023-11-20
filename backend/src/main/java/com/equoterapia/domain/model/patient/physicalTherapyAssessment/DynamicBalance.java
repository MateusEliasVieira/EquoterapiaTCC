package com.equoterapia.domain.model.patient.physicalTherapyAssessment;

import com.equoterapia.domain.enums.StaticBalance;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DynamicBalance {

    // Equilíbrio Dinâmico (Dynamic Balance)

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDynamicBalance;
    @Enumerated @NotBlank
    private StaticBalance crawl;
    @NotBlank
    private String crawlComments;
    @Enumerated @NotBlank
    private StaticBalance voluntaryMarch;
    @NotBlank
    private String voluntaryMarchComments;
    @Enumerated @NotBlank
    private StaticBalance jumpWithFeetTogether;
    @NotBlank
    private String jumpWithFeetTogetherComments;
    @Enumerated @NotBlank
    private StaticBalance runAvoidingObstacles;
    @NotBlank
    private String runAvoidingObstaclesComments;

    @OneToOne
    @JoinColumn(name = "physicalTherapyAssessment_id")
    private PhysicalTherapyAssessment physicalTherapyAssessment;

}
