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
public class HabilidadesSociais {

    // Habilidades sociais

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHabilidadesSociais;
    @Enumerated @NotBlank
    private PreencherLegenda passividade;
    @Enumerated @NotBlank
    private PreencherLegenda autoagressao;
    @Enumerated @NotBlank
    private PreencherLegenda heteroagressividade;
    @Enumerated @NotBlank
    private PreencherLegenda assertividade;

    @OneToOne
    @JoinColumn(name = "avaliacao_psicologica_id")
    private AvaliacaoPsicologica avaliacaoPsicologica;

}

