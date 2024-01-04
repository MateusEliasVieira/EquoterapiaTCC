package com.equoterapia.domain.model.paciente.avaliacaoFisioterapeutica;

import com.equoterapia.domain.model.paciente.Paciente;
import com.equoterapia.domain.model.patient.physicalTherapyAssessment.FormaDeComunicacao;
import com.equoterapia.domain.model.patient.physicalTherapyAssessment.MobilidadeArticular;
import com.equoterapia.domain.model.patient.physicalTherapyAssessment.GruposMusculares;
import com.equoterapia.domain.model.patient.physicalTherapyAssessment.HabilidadesMotorasAVD;

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
public class AvaliacaoFisioterapeutica {

    // Avaliação Fisioterapêutica
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAvaliacaoFisioterapeutica;
    private String diagnosticoFisioterapeutico;
    private String historicoGravidez;
    @OneToOne(mappedBy = "avaliacaoFisioterapeutica")
    private SaudeGeralDosPacientes saudeGeralDosPacientes;
    @OneToOne(mappedBy = "avaliacaoFisioterapeutica")
    private FormaDeComunicacao formaDeComunicacao;

    @OneToOne(mappedBy = "avaliacaoFisioterapeutica")
    private QuadroAtual quadroAtual;

    @OneToOne(mappedBy = "avaliacaoFisioterapeutica")
    private MobilidadeArticular mobilidadeArticular;

    @OneToOne(mappedBy = "avaliacaoFisioterapeutica")
    private GruposMusculares gruposMusculares;

    @OneToOne(mappedBy = "avaliacaoFisioterapeutica")
    private EquilibrioEstatico equilibrioEstatico;

    @OneToOne(mappedBy = "avaliacaoFisioterapeutica")
    private EquilibrioDinamico equilibrioDinamico;

    @OneToOne(mappedBy = "avaliacaoFisioterapeutica")
    private HabilidadesMotorasAVD habilidadesMotorasAVD;

    @OneToOne(mappedBy = "avaliacaoFisioterapeutica")
    private CoordenacaoMotora coordenacaoMotora;

    // Descrever Tonus Muscular
    private String tonusMuscular;

    // Conclusão/Indicação para Equoterapia
    private String conclusaoIndicacaoEquoterapia;
    @OneToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

}


