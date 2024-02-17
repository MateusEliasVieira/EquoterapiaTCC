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
public class SaudeMental {

    // Saúde mental

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSaudeMental;
    @Enumerated @NotNull
    private PreencherLegenda apresentaConfusaoMental;
    @Enumerated @NotNull
    private PreencherLegenda apresentaDelirios;
    @Enumerated @NotNull
    private PreencherLegenda apresentaAlucinacoes;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "avaliacao_psicologica_id")
    private AvaliacaoPsicologica avaliacaoPsicologica;

}

