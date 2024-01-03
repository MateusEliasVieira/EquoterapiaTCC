package com.equoterapia.domain.model.patient.physicalTherapyAssessment;

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
public class QuadroAtual {

    // Quadro atual

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idQuadroAtual;
    @NotBlank
    private String locomocaoAtual;
    @NotBlank
    private String restricoes;
    @NotBlank
    private String deformidades;

    @OneToOne
    @JoinColumn(name = "id_avaliacao_fisioterapia")
    private AvaliacaoFisioterapia avaliacaoFisioterapia;

}

