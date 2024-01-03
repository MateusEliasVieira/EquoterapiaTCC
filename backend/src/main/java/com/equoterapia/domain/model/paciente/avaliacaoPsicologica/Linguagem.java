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
public class Linguagem {

    // Linguagem

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLinguagem;
    @Enumerated @NotNull
    private PreencherLegenda compreensaoVerbal;
    @Enumerado @NotNull
    private PreencherLegenda gesto;
    @Enumerado @NotNull
    private PreencherLegenda gritos;
    @Enumerado @NotNull
    private PreencherLegenda mímicaFacial;
    @Enumerado @NotNull
    private PreencherLegenda monossílabos;
    @Enumerado @NotNull
    private PreencherLegenda frasesCurtas;
    @Enumerado @NotNull
    private PreencherLegenda frasesCompletas;

    @OneToOne
    @JoinColumn(name = "id_avaliacao_psicologica")
    private AvaliacaoPsicologica avaliacaoPsicologica;

}

