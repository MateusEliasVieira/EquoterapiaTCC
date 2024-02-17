package com.equoterapia.domain.model.paciente.avaliacaoPsicologica;

import com.equoterapia.domain.enums.PreencherLegenda;
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
    @Enumerated @NotBlank
    private PreencherLegenda compreendeOrdens;
    @Enumerated @NotBlank
    private PreencherLegenda executaOrdensVerbaisSimples;
    @Enumerated @NotBlank
    private PreencherLegenda executaOrdensComplexas;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "avaliacao_psicologica_id")
    private AvaliacaoPsicologica avaliacaoPsicologica;

}

