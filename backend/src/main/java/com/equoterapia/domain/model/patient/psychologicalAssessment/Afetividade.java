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
public class Afetividade {

    // Afetividade

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAfetividade;
    @Enumerated @NotNull
    private PreencherLegenda demonstraAfeicaoEspecialPorAlguem;
    @Enumerado @NotNull
    private PreencherLegenda compartilhaSuasCoisas;
    @Enumerado @NotNull
    private PreencherLegenda ajudaQuandoSolicitado;
    @Enumerado @NotNull
    private PreencherLegenda expressaoDeSentimentos;

    @OneToOne
    @JoinColumn(name = "id_avaliacao_psicologica")
    private AvaliacaoPsicologica avaliacaoPsicologica;

}

