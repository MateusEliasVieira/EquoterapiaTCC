package com.equoterapia.domain.model.patient.psychologicalAssessment;

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
public class Saude {

    // Saúde

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSaude;
    @NotBlank
    private String alergias;
    @NotBlank
    private String convulsoes;
    @NotBlank
    private String doencas;
    @NotBlank
    private String digestao;
    @NotBlank
    private String transtornoAlimentar;
    @NotBlank
    private String respiracao;
    @NotBlank
    private String sono;
    @NotBlank
    private String deficitCognitivo;

    @OneToOne
    @JoinColumn(name = "id_avaliacao_psicologica")
    private AvaliacaoPsicologica avaliacaoPsicologica;

}

