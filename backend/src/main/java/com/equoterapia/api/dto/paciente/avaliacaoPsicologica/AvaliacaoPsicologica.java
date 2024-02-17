package com.equoterapia.domain.model.paciente.avaliacaoPsicologica;

import com.equoterapia.domain.model.paciente.Paciente;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class AvaliacaoPsicologica {

    // Avaliação dos aspectos psicológicos

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAvaliacaoPsicologica;

    @OneToOne(mappedBy = "avaliacaoPsicologica", cascade = CascadeType.ALL)
    private SobreACrianca sobreACrianca;

    @OneToOne(mappedBy = "avaliacaoPsicologica", cascade = CascadeType.ALL)
    private Saude saude;

    @OneToOne(mappedBy = "avaliacaoPsicologica", cascade = CascadeType.ALL)
    private Rotina rotina;

    @OneToOne(mappedBy = "avaliacaoPsicologica", cascade = CascadeType.ALL)
    private TracosDePersonalidade tracosDePersonalidade;

    @OneToOne(mappedBy = "avaliacaoPsicologica", cascade = CascadeType.ALL)
    private Linguagem linguagem;

    @OneToOne(mappedBy = "avaliacaoPsicologica", cascade = CascadeType.ALL)
    private Compreensao compreensao;

    @OneToOne(mappedBy = "avaliacaoPsicologica", cascade = CascadeType.ALL)
    private SaudeMental saudeMental;

    @OneToOne(mappedBy = "avaliacaoPsicologica", cascade = CascadeType.ALL)
    private Socializacao socializacao;

    @OneToOne(mappedBy = "avaliacaoPsicologica", cascade = CascadeType.ALL)
    private Comportamento comportamento;

    @OneToOne(mappedBy = "avaliacaoPsicologica", cascade = CascadeType.ALL)
    private HabilidadesSociais habilidadesSociais;

    @OneToOne(mappedBy = "avaliacaoPsicologica", cascade = CascadeType.ALL)
    private Afetividade afetividade;

    @OneToOne(mappedBy = "avaliacaoPsicologica", cascade = CascadeType.ALL)
    private RelacaoFamiliarExaminado relacaoFamiliarExaminado;

    private String expectativasFamiliaresTerapiaEquina;
    private String resumoCasoObservacoesComplementares;

    private String imagemAssinaturaOuCRPECarimbo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

}

