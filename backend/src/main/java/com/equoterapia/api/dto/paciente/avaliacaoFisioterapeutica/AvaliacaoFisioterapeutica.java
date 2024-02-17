package com.equoterapia.domain.model.paciente.avaliacaoFisioterapeutica;

import com.equoterapia.domain.model.paciente.Paciente;
import com.equoterapia.domain.model.patient.physicalTherapyAssessment.MobilidadeArticular;
import com.equoterapia.domain.model.patient.physicalTherapyAssessment.GruposMusculares;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class AvaliacaoFisioterapeutica {

    // Avaliação Fisioterapêutica
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAvaliacaoFisioterapeutica;
    private String diagnosticoFisioterapeutico;
    private String historicoGravidez;
    @OneToOne(mappedBy = "avaliacaoFisioterapeutica", cascade = CascadeType.ALL)
    private SaudeGeralDosPacientes saudeGeralDosPacientes;
    @OneToOne(mappedBy = "avaliacaoFisioterapeutica", cascade = CascadeType.ALL)
    private FormaDeComunicacao formaDeComunicacao;

    @OneToOne(mappedBy = "avaliacaoFisioterapeutica", cascade = CascadeType.ALL)
    private QuadroAtual quadroAtual;

    @OneToOne(mappedBy = "avaliacaoFisioterapeutica", cascade = CascadeType.ALL)
    private MobilidadeArticular mobilidadeArticular;

    @OneToOne(mappedBy = "avaliacaoFisioterapeutica", cascade = CascadeType.ALL)
    private GruposMusculares gruposMusculares;

    @OneToOne(mappedBy = "avaliacaoFisioterapeutica", cascade = CascadeType.ALL)
    private EquilibrioEstatico equilibrioEstatico;

    @OneToOne(mappedBy = "avaliacaoFisioterapeutica", cascade = CascadeType.ALL)
    private EquilibrioDinamico equilibrioDinamico;

    @OneToOne(mappedBy = "avaliacaoFisioterapeutica", cascade = CascadeType.ALL)
    private HabilidadesMotorasAVD habilidadesMotorasAVD;

    @OneToOne(mappedBy = "avaliacaoFisioterapeutica", cascade = CascadeType.ALL)
    private CoordenacaoMotora coordenacaoMotora;

    // Descrever Tonus Muscular
    private String tonusMuscular;

    // Conclusão/Indicação para Equoterapia
    private String conclusaoIndicacaoEquoterapia;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

}


