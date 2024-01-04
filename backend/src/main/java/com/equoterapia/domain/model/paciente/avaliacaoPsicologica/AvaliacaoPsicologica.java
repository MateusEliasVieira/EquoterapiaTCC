package com.equoterapia.domain.model.paciente.avaliacaoPsicologica;

import com.equoterapia.domain.model.paciente.Paciente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AvaliacaoPsicologica {

    // Avaliação dos aspectos psicológicos

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAvaliacaoPsicologica;

    @OneToOne(mappedBy = "avaliacaoPsicologica")
    private SobreACrianca sobreACrianca;

    @OneToOne(mappedBy = "avaliacaoPsicologica")
    private Saude saude;

    @OneToOne(mappedBy = "avaliacaoPsicologica")
    private Rotina rotina;

    @OneToOne(mappedBy = "avaliacaoPsicologica")
    private TracosDePersonalidade tracosDePersonalidade;

    @OneToOne(mappedBy = "avaliacaoPsicologica")
    private Linguagem linguagem;

    @OneToOne(mappedBy = "avaliacaoPsicologica")
    private Compreensao compreensao;

    @OneToOne(mappedBy = "avaliacaoPsicologica")
    private SaudeMental saudeMental;

    @OneToOne(mappedBy = "avaliacaoPsicologica")
    private Socializacao socializacao;

    @OneToOne(mappedBy = "avaliacaoPsicologica")
    private Comportamento comportamento;

    @OneToOne(mappedBy = "avaliacaoPsicologica")
    private HabilidadesSociais habilidadesSociais;

    @OneToOne(mappedBy = "avaliacaoPsicologica")
    private Afetividade afetividade;

    @OneToOne(mappedBy = "avaliacaoPsicologica")
    private RelacaoFamiliarExaminado relacaoFamiliarExaminado;

    private String expectativasFamiliaresTerapiaEquina;
    private String resumoCasoObservacoesComplementares;

    private String imagemAssinaturaOuCRPECarimbo;

    @OneToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

}

