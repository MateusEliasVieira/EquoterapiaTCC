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
public class SaudeMental {

    // Saúde mental

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSaudeMental;
    @Enumerado @NotNull
    private PreencherLegenda apresentaConfusaoMental;
    @Enumerado @NotNull
    private PreencherLegenda apresentaDelirios;
    @Enumerado @NotNull
    private PreencherLegenda apresentaAlucinacoes;

    @OneToOne
    @JoinColumn(name = "id_avaliacao_psicologica")
    private AvaliacaoPsicologica avaliacaoPsicologica;

}

