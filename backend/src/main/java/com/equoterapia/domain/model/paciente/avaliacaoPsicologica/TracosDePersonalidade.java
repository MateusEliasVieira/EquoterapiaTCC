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
public class TracosDePersonalidade {

    // Traços de personalidade

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTracosDePersonalidade;
    @Enumerated @NotNull
    private PreencherLegenda extroversao;
    @Enumerated @NotNull
    private PreencherLegenda fobia;
    @Enumerated @NotNull
    private PreencherLegenda obsessao;
    @Enumerated @NotNull
    private PreencherLegenda introversao;
    @Enumerated @NotNull
    private PreencherLegenda ansiedade;
    @Enumerated @NotNull
    private PreencherLegenda histeria;
    @Enumerated @NotNull
    private PreencherLegenda dependenciaEmocional;
    @Enumerated @NotNull
    private PreencherLegenda timidez;

    @OneToOne
    @JoinColumn(name = "avaliacao_psicologica_id")
    private AvaliacaoPsicologica avaliacaoPsicologica;

}
