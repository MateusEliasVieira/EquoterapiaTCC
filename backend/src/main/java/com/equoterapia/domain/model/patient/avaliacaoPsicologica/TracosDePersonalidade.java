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
public class TracosDePersonalidade {

    // Traços de personalidade

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTracosDePersonalidade;
    @Enumerado @NotNull
    private PreencherLegenda extroversao;
    @Enumerado @NotNull
    private PreencherLegenda fobia;
    @Enumerado @NotNull
    private PreencherLegenda obsessao;
    @Enumerado @NotNull
    private PreencherLegenda introversao;
    @Enumerado @NotNull
    private PreencherLegenda ansiedade;
    @Enumerado @NotNull
    private PreencherLegenda histeria;
    @Enumerado @NotNull
    private PreencherLegenda dependenciaEmocional;
    @Enumerado @NotNull
    private PreencherLegenda timidez;

    @OneToOne
    @JoinColumn(name = "id_avaliacao_psicologica")
    private AvaliacaoPsicologica avaliacaoPsicologica;

}
