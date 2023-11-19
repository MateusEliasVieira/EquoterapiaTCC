package com.equoterapia.domain.model.patient;

import com.equoterapia.domain.enums.StaticBalance;
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
public class PhysicalTherapyAssessment {

    // Avaliação Fisioterapêutica

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPhysicalTherapyAssessment;

    private String physiotherapeuticDiagnosis;
    private String pregnancyHistory;

    // saúde geral do paciente
    private Boolean priorSeizures;
    private String priorSeizuresComments;
    private Boolean currentSeizures;
    private String currentSeizuresComments;
    private String currentSeizuresFrequency;
    private Boolean medications;
    private String medicationsComments;
    private Boolean constipation;
    private String constipationComments;
    private Boolean sleep;
    private String sleepComments;
    private Boolean hearing;
    private String hearingComments;
    private Boolean vision;
    private String visionComments;
    private Boolean gastroesophagealReflux;
    private String gastroesophagealRefluxComments;
    private Boolean surgicalInterventions;
    private String surgicalInterventionsComments;
    private Boolean allergies;
    private String allergiesComments;

    // forma de comunicação
    private Boolean speech;
    private String speechComments;
    private Boolean gestures;
    private String gesturesComments;
    private Boolean useOfEyes;
    private String useOfEyesComments;

    // queixa principal
    private String chiefComplaint;

    // quadro atual
    private String currentLocomotion;
    private String restrictions;
    private String deformities;

    // mobilidade articular
    // ombro
    private String ombroFlexaoAtiva;
    private String ombroFlexaoPassiva;
    private String ombroAbducaoAtiva;
    private String ombroAbducaoPassiva;
    private String ombroAducaoAtiva;
    private String ombroAducaoPassiva;
    // cotovelo
    private String cotoveloFlexaoAtiva;
    private String cotoveloFlexaoPassiva;
    private String cotoveloExtensaoAtiva;
    private String cotoveloExtensaoPassiva;
    // quadril
    private String quadrilFlexaoAtiva;
    private String quadrilFlexaoPassiva;
    private String quadrilExtensaoAtiva;
    private String quadrilExtensaoPassiva;
    private String quadrilAducaoAtiva;
    private String quadrilAducaoPassiva;
    private String quadrilAbducaoAtiva;
    private String quadrilAbducaoPassiva;
    private String quadrilRotacaoInternaAtiva;
    private String quadrilRotacaoInternaPassiva;
    private String quadrilRotacaoExternaAtiva;
    private String quadrilRotacaoExternaPassiva;
    // joelho
    private String joelhoExtensaoAtiva;
    private String joelhoExtensaoPassiva;
    private String joelhoFlexaoAtiva;
    private String joelhoFlexaoPassiva;
    // tornozelo
    private String tornozeloDorsiflexaoAtiva;
    private String tornozeloDorsiflexaoPassiva;
    private String tornozeloPlantiflexaoAtiva;
    private String tornozeloPlantiflexaoPassiva;

    // grupos musculares e escala de ashworth modificada
    private String flexoresDeOmbroDireito;
    private String flexoresDeOmbroEsquerdo;
    private String extensoresDeOmbroDireito;
    private String extensoresDeOmbroEsquerdo;
    private String flexoresDeCotoveloDireito;
    private String flexoresDeCotoveloEsquerdo;
    private String extensoresDeCotoveloDireito;
    private String extensoresDeCotoveloEsquerdo;
    private String flexoresDePunhoDireito;
    private String flexoresDePunhoEsquerdo;
    private String extensoresDePunhoDireito;
    private String extensoresDePunhoEsquerdo;
    private String flexoresDeQuadrilDireito;
    private String flexoresDeQuadrilEsquerdo;
    private String extensoresDeQuadrilDireito;
    private String extensoresDeQuadrilEsquerdo;
    private String flexoresDeJoelhoDireito;
    private String flexoresDeJoelhoEsquerdo;
    private String dorsiflexoresDeTornozeloDireito;
    private String dorsiflexoresDeTornozeloEsquerdo;
    private String plantiflexorDeTornozeloDireito;
    private String plantiflexorDeTornozeloEsquerdo;

    // equilíbrio estático
    private StaticBalance sustentoDaCabeca;
    private String sustentoDaCabecaComentario;
    private StaticBalance sentaSemApoio;
    private String sentaSemApoioComentario;
    private StaticBalance sentaComApoio;
    private String sentaComApoioComentario;
    private StaticBalance posicaoOrtostaticaSemApoio;
    private String posicaoOrtostaticaSemApoioComentario;
    private StaticBalance posicaoOrtostaticaComApoio;
    private String posicaoOrtostaticaComApoioComentario;
    private StaticBalance posicaoMilitarOlhosAbertos;
    private String posicaoMilitarOlhosAbertosComentario;
    private StaticBalance posicaoMilitarOlhosFechados;
    private String posicaoMilitarOlhosFechadosComentario;
    private StaticBalance sobreUmPeOlhosAbertos;
    private String sobreUmPeOlhosAbertosComentario;
    private StaticBalance sobreUmPeOlhosFechados;
    private String sobreUmPeOlhosFechadosComentario;

    // equilíbrio dinâmico
    private StaticBalance engatinha;
    private String engatinhaComentario;
    private StaticBalance marchaVoluntaria;
    private String marchaVoluntariaComentario;
    private StaticBalance saltarComPesJuntos;
    private String saltarComPesJuntosComentario;
    private StaticBalance correrDesviandoObstaculos;
    private String correrDesviandoObstaculosComentario;

    // motricidade/avd's
    private Boolean alcanceObjetos;
    private String alcanceObjetosConsideracoes;
    private Boolean usoBimanual;
    private String usoBimanualConsideracoes;
    private Boolean alimentaSozinho;
    private String alimentaSozinhoConsideracoes;
    private Boolean vesteSozinho;
    private String vesteSozinhoConsideracoes;
    private Boolean preensaoObjetos;
    private String preensaoObjetosConsideracoes;
    private Boolean negligenciaMembro;
    private String negligenciaMembroConsideracoes;
    private Boolean HigienizaSozinho;
    private String HigienizaSozinhoConsideracoes;
    private Boolean caminhar;
    private String caminharConsideracoes;
    private Boolean escritaManual;
    private String escritaManualConsideracoes;

    // coordenacao motora
    private Boolean provaMaoObjetos;
    private String provaMaoObjetosConsideracoes;
    private Boolean indexNarizUnilateral;
    private String indexNarizUnilateralConsideracoes;
    private Boolean indexIndex;
    private String indexIndexConsideracoes;
    private Boolean movimentosAlternados;
    private String movimentosAlternadosConsideracoes;
    private Boolean provaRechaco;
    private String provaRechacoConsideracoes;

    // descrever tonus muscular
    private String tonusMuscular;

    // conclusão/indicação para equoterapia
    private String conclusaoIndicacaoParaEquoterapia;

    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

}

