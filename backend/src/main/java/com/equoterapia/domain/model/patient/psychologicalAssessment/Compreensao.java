package com.equoterapia.domain.model.patient.psychologicalAssessment;

import com.equoterapia.domain.enums.FillCaption;
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
public class Compreensao {

    // Compreensão

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompreensao;
    @Enumerado @NotBlank
    private PreencherLegenda compreendeOrdens;
    @Enumerado @NotBlank
    private PreencherLegenda executaOrdensVerbaisSimples;
    @Enumerado @NotBlank
    private PreencherLegenda executaOrdensComplexas;

    @OneToOne
    @JoinColumn(name = "id_avaliacao_psicologica")
    private AvaliacaoPsicologica avaliacaoPsicologica;

}

