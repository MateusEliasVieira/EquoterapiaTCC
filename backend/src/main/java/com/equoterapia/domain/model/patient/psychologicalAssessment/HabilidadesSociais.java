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
public class HabilidadesSociais {

    // Habilidades sociais

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHabilidadesSociais;
    @Enumerado @NotBlank
    private PreencherLegenda passividade;
    @Enumerado @NotBlank
    private PreencherLegenda autoagressao;
    @Enumerado @NotBlank
    private PreencherLegenda heteroagressividade;
    @Enumerado @NotBlank
    private PreencherLegenda assertividade;

    @OneToOne
    @JoinColumn(name = "id_avaliacao_psicologica")
    private AvaliacaoPsicologica avaliacaoPsicologica;

}

