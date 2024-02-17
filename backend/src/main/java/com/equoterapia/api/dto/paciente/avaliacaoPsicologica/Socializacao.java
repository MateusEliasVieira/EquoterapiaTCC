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
public class Socializacao {

    // Socialização

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSocializacao;
    @Enumerated @NotBlank
    private PreencherLegenda interageBemComOutrasCriancas;
    @Enumerated @NotBlank
    private PreencherLegenda interageBemComAdultos;
    @Enumerated @NotBlank
    private PreencherLegenda buscaContatoSocial;
    @Enumerated @NotBlank
    private PreencherLegenda temOportunidadeContato;
    @Enumerated @NotBlank
    private PreencherLegenda fazContatoVisual;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "avaliacao_psicologica_id")
    private AvaliacaoPsicologica avaliacaoPsicologica;

}

