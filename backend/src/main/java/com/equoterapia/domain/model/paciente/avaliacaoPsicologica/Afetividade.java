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
public class Afetividade {

    // Afetividade

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAfetividade;
    @Enumerated @NotNull
    private PreencherLegenda demonstraAfeicaoEspecialPorAlguem;
    @Enumerated @NotNull
    private PreencherLegenda compartilhaSuasCoisas;
    @Enumerated @NotNull
    private PreencherLegenda ajudaQuandoSolicitado;
    @Enumerated @NotNull
    private PreencherLegenda expressaoDeSentimentos;

    @OneToOne
    @JoinColumn(name = "avaliacao_psicologica_id")
    private AvaliacaoPsicologica avaliacaoPsicologica;

}

