package com.equoterapia.domain.model.paciente.avaliacaoFisioterapeutica;

import com.equoterapia.domain.enums.EquilibrioEstatico;
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
public class EquilibrioDinamico {

    // Equilíbrio Dinâmico

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquilibrioDinamico;
    @Enumerated @NotBlank
    private EquilibrioEstatico engatinhar;
    @NotBlank
    private String comentariosEngatinhar;
    @Enumerated @NotBlank
    private EquilibrioEstatico marchaVoluntaria;
    @NotBlank
    private String comentariosMarchaVoluntaria;
    @Enumerated @NotBlank
    private EquilibrioEstatico saltarPesJuntos;
    @NotBlank
    private String comentariosSaltarPesJuntos;
    @Enumerated @NotBlank
    private EquilibrioEstatico correrDesviandoObstaculos;
    @NotBlank
    private String comentariosCorrerDesviandoObstaculos;

    @OneToOne
    @JoinColumn(name = "avaliacao_fisioterapeutica_id")
    private AvaliacaoFisioterapeutica avaliacaoFisioterapeutica;

}

