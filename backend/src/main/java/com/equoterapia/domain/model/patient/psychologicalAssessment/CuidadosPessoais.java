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
public class CuidadosPessoais {

    // Cuidados pessoais

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCuidadosPessoais;
    @Enumerado @NotNull
    private PreencherLegenda higienePessoalSozinho;
    @Enumerado @NotNull
    private PreencherLegenda vesteRoupasCalcadosSozinho;
    @Enumerado @NotNull
    private PreencherLegenda seAlimentaSozinho;

    @OneToOne
    @JoinColumn(name = "id_avaliacao_psicologica")
    private AvaliacaoPsicologica avaliacaoPsicologica;

}
