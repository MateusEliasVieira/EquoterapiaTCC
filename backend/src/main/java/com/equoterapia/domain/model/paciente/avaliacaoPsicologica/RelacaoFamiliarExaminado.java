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
public class RelacaoFamiliarExaminado {

    // Relação da família com o examinado (percepção do entrevistador)

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRelacaoFamiliarExaminado;
    @Enumerated @NotNull
    private PreencherLegenda adequado;
    @Enumerado @NotNull
    private PreencherLegenda superprotecao;
    @Enumerado @NotNull
    private PreencherLegenda dificuldadePerceberDeficiencias;
    @Enumerado @NotNull
    private PreencherLegenda rejeicao;
    @Enumerado @NotNull
    private PreencherLegenda indiferenca;
    @Enumerado @NotNull
    private PreencherLegenda ansiedadePercebidaEntrevistador;

    @OneToOne
    @JoinColumn(name = "id_avaliacao_psicologica")
    private AvaliacaoPsicologica avaliacaoPsicologica;

}

