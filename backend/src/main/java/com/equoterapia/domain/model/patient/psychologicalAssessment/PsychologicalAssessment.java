package com.equoterapia.domain.model.patient;

import com.equoterapia.domain.enums.FillCaption;
import com.equoterapia.domain.model.Patient;
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
public class PsychologicalAssessment {

    // Avaliação dos aspectos psicológicos

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPsychologicalAssessment;
    private Boolean didEquineTherapy;
    private Boolean plannedChild;
    private Boolean prenatalCare;
    private Boolean criedAtBirth;
    private String food;
    private String observation;

    // saúde
    private String allergies;
    private String convulsions;
    private String illnesses; //doenças
    private String digestion;
    private String eatingDisorder; // transtorno alimentar
    private String breathing; // respiração
    private String sleep;
    private String cognitiveDeficit;

    // rotina
    private String pranks;
    private String preferences; // preferencias por brincadeiras
    private Boolean acceptChangesRoutine;
    private String considerationsAboutRoutine;

    // cuidados pessoais
    private FillCaption personalHygieneYourself;
    private FillCaption wearsClothesShoesAlone;
    private FillCaption feedsAlone;

    // traços de personalidade
    private FillCaption extroversion;
    private FillCaption phobia;
    private FillCaption obsession;
    private FillCaption introversion;
    private FillCaption anxiety;
    private FillCaption hysteria;
    private FillCaption emotionalDependence;
    private FillCaption shyness; // timidez

    // linguagem
    private FillCaption understandingVerbal;
    private FillCaption gesture;
    private FillCaption screams; // gritos
    private FillCaption facialMimicry; // mímica facial
    private FillCaption monosyllables;
    private FillCaption shortSentences;
    private FillCaption completeSentences;

    // compreensão
    private FillCaption understandsOrders;
    private FillCaption executesSimpleVerbalOrders;
    private FillCaption executeComplexOrders;

    // saúde mental
    private FillCaption presentsMentalConfusion;
    private FillCaption presentsDelusions;
    private FillCaption presentsHallucinations;

    // socialização
    private FillCaption interactsWellWithOtherChildrens;
    private FillCaption interactsWellWithAdults;
    private FillCaption seeksSocialContact;
    private FillCaption haveOpportunityContact;
    private FillCaption makesEyeContact;

    // comportamento
    private FillCaption agitation;
    private FillCaption toleranceFrustration;
    private FillCaption respectsLimitsRules;
    private FillCaption opposition;
    private FillCaption attentionConcentration;

    // habilidades sociais
    private FillCaption passivity;
    private FillCaption selfAggression;
    private FillCaption heteroAggressiveness;
    private FillCaption assertiveness;

    // afetividade
    private FillCaption showsSpecialAffectionForSomeone;
    private FillCaption shareYourThings;
    private FillCaption helpWhenAsked;
    private FillCaption expressionFeelings;

    // relação da família com o examinado (percepção do entrevistador)
    private FillCaption proper; // adequado
    private FillCaption overprotection;
    private FillCaption difficultyNoticingDeficiencies;
    private FillCaption rejection;
    private FillCaption indifference;
    private FillCaption anxietyPerceivedExaminer; // ansiedade percebida pelo examinador

    private String familyExpectationsEquineTherapy;
    private String caseSummaryComplementaryObservations;

    private String imageSignatureOrCRPAndStamp;

    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

}
