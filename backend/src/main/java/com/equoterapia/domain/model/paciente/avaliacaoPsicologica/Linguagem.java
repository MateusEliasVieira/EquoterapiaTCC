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
public class Linguagem {

    // Linguagem

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLinguagem;
    @Enumerated @NotNull
    private PreencherLegenda compreensaoVerbal;
    @Enumerated @NotNull
    private PreencherLegenda gesto;
    @Enumerated @NotNull
    private PreencherLegenda gritos;
    @Enumerated @NotNull
    private PreencherLegenda mímicaFacial;
    @Enumerated @NotNull
    private PreencherLegenda monossílabos;
    @Enumerated @NotNull
    private PreencherLegenda frasesCurtas;
    @Enumerated @NotNull
    private PreencherLegenda frasesCompletas;

    @OneToOne
    @JoinColumn(name = "avaliacao_psicologica_id")
    private AvaliacaoPsicologica avaliacaoPsicologica;

}

