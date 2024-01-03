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
public class Socializacao {

    // Socialização

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSocializacao;
    @Enumerado @NotBlank
    private PreencherLegenda interageBemComOutrasCriancas;
    @Enumerado @NotBlank
    private PreencherLegenda interageBemComAdultos;
    @Enumerado @NotBlank
    private PreencherLegenda buscaContatoSocial;
    @Enumerado @NotBlank
    private PreencherLegenda temOportunidadeContato;
    @Enumerado @NotBlank
    private PreencherLegenda fazContatoVisual;

    @OneToOne
    @JoinColumn(name = "id_avaliacao_psicologica")
    private AvaliacaoPsicologica avaliacaoPsicologica;

}

