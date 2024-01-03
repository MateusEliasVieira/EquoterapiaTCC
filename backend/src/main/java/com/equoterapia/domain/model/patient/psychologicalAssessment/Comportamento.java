package com.equoterapia.domain.model.patient.psychologicalAssessment;

import com.equoterapia.domain.enums.FillCaption;
import jakarta.persistence.*;
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
public class Comportamento {

    // Comportamento

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComportamento;
    @Enumerated @NotNull
    private PreencherLegenda agitacao;
    @Enumerado @NotNull
    private PreencherLegenda toleranciaFrustracao;
    @Enumerado @NotNull
    private PreencherLegenda respeitaLimitesRegras;
    @Enumerado @NotNull
    private PreencherLegenda oposicao;
    @Enumerado @NotNull
    private PreencherLegenda atencaoConcentracao;

    @OneToOne
    @JoinColumn(name = "id_avaliacao_psicologica")
    private AvaliacaoPsicologica avaliacaoPsicologica;

}
