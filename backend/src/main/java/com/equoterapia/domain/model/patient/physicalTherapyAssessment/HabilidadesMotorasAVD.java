package com.equoterapia.domain.model.patient.physicalTherapyAssessment;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class HabilidadesMotorasAVD {

    // Habilidades Motoras/AVD's

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHabilidadesMotorasAVD;
    @NotNull
    private Boolean alcancarObjetos;
    @NotBlank
    private String consideracoesAlcancarObjetos;
    @NotNull
    private Boolean usoBimanual;
    @NotBlank
    private String consideracoesUsoBimanual;
    @NotNull
    private Boolean alimentacaoIndependente;
    @NotBlank
    private String consideracoesAlimentacaoIndependente;
    @NotNull
    private Boolean vestirIndependente;
    @NotBlank
    private String consideracoesVestirIndependente;
    @NotNull
    private Boolean pegarObjetos;
    @NotBlank
    private String consideracoesPegarObjetos;
    @NotNull
    private Boolean negligenciaMembro;
    @NotBlank
    private String consideracoesNegligenciaMembro;
    @NotNull
    private Boolean higienePessoal;
    @NotBlank
    private String consideracoesHigienePessoal;
    @NotNull
    private Boolean andar;
    @NotBlank
    private String consideracoesAndar;
    @NotNull
    private Boolean escritaManual;
    @NotBlank
    private String consideracoesEscritaManual;

    @OneToOne
    @JoinColumn(name = "id_avaliacao_fisioterapia")
    private AvaliacaoFisioterapia avaliacaoFisioterapia;

}

