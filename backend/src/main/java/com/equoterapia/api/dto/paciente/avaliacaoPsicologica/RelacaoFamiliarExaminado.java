package com.equoterapia.domain.model.paciente.avaliacaoPsicologica;

import com.equoterapia.domain.enums.PreencherLegenda;
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
    @Enumerated @NotNull
    private PreencherLegenda superprotecao;
    @Enumerated @NotNull
    private PreencherLegenda dificuldadePerceberDeficiencias;
    @Enumerated @NotNull
    private PreencherLegenda rejeicao;
    @Enumerated @NotNull
    private PreencherLegenda indiferenca;
    @Enumerated @NotNull
    private PreencherLegenda ansiedadePercebidaEntrevistador;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "avaliacao_psicologica_id")
    private AvaliacaoPsicologica avaliacaoPsicologica;

}

