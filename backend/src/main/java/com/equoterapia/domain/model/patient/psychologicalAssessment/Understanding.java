package com.equoterapia.domain.model.patient.psychologicalAssessment;

import com.equoterapia.domain.enums.FillCaption;
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
public class Understanding {

    // Compreensão

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUnderstanding;
    @Enumerated @NotBlank
    private FillCaption understandsOrders;
    @Enumerated @NotBlank
    private FillCaption executesSimpleVerbalOrders;
    @Enumerated @NotBlank
    private FillCaption executeComplexOrders;

    @OneToOne
    @JoinColumn(name = "psychologicalAssessment_id")
    private PsychologicalAssessment psychologicalAssessment;

}
