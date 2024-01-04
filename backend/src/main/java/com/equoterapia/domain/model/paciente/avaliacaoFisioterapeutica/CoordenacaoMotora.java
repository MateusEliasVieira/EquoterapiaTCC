package com.equoterapia.domain.model.paciente.avaliacaoFisioterapeutica;

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
public class CoordenacaoMotora {

    // Coordenação Motora

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCoordenacaoMotora;
    @NotNull
    private Boolean testeMaoObjeto;
    @NotBlank
    private String consideracoesTesteMaoObjeto;
    @NotNull
    private Boolean indiceNarizUnilateral;
    @NotBlank
    private String consideracoesIndiceNarizUnilateral;
    @NotNull
    private Boolean testeIndiceIndice;
    @NotBlank
    private String consideracoesTesteIndiceIndice;
    @NotNull
    private Boolean movimentosAlternados;
    @NotBlank
    private String consideracoesMovimentosAlternados;
    @NotNull
    private Boolean testeAlcancePegar;
    @NotBlank
    private String consideracoesTesteAlcancePegar;

    @OneToOne
    @JoinColumn(name = "avaliacao_fisioterapeutica_id")
    private AvaliacaoFisioterapeutica avaliacaoFisioterapeutica;

}

