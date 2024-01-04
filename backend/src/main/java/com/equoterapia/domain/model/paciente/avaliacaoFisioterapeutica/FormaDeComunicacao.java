package com.equoterapia.domain.model.patient.physicalTherapyAssessment;

import com.equoterapia.domain.model.paciente.avaliacaoFisioterapeutica.AvaliacaoFisioterapeutica;
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
public class FormaDeComunicacao {

    // Forma de comunicação

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFormaDeComunicacao;
    @NotNull
    private Boolean fala;
    @NotBlank
    private String consideracoesFala;
    @NotNull
    private Boolean gestos;
    @NotBlank
    private String consideracoesGestos;
    @NotNull
    private Boolean usoDosOlhos;
    @NotBlank
    private String consideracoesUsoDosOlhos;

    @OneToOne
    @JoinColumn(name = "avaliacao_fisioterapeutica_id")
    private AvaliacaoFisioterapeutica avaliacaoFisioterapeutica;

}

