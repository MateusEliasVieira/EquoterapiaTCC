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
public class CuidadosPessoais {

    // Cuidados pessoais

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCuidadosPessoais;
    @Enumerated @NotNull
    private PreencherLegenda higienePessoalSozinho;
    @Enumerated @NotNull
    private PreencherLegenda vesteRoupasCalcadosSozinho;
    @Enumerated @NotNull
    private PreencherLegenda seAlimentaSozinho;

    @OneToOne
    @JoinColumn(name = "avaliacao_psicologica_id")
    private AvaliacaoPsicologica avaliacaoPsicologica;

}
