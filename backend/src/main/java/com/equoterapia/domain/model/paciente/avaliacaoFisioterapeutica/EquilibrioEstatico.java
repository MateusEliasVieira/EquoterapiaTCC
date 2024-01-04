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
public class EquilibrioEstatico {

    // Equilíbrio Estático

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquilibrioEstatico;
    @Enumerated
    @NotNull
    private com.equoterapia.domain.enums.EquilibrioEstatico apoioCabeca;
    @NotBlank
    private String comentariosApoioCabeca;
    @Enumerated
    @NotNull
    private com.equoterapia.domain.enums.EquilibrioEstatico sentarSemApoio;
    @NotBlank
    private String comentariosSentarSemApoio;
    @Enumerated
    @NotNull
    private com.equoterapia.domain.enums.EquilibrioEstatico sentarComApoio;
    @NotBlank
    private String comentariosSentarComApoio;
    @Enumerated
    @NotNull
    private com.equoterapia.domain.enums.EquilibrioEstatico emPeSemApoio;
    @NotBlank
    private String comentariosEmPeSemApoio;
    @Enumerated
    @NotNull
    private com.equoterapia.domain.enums.EquilibrioEstatico emPeComApoio;
    @NotBlank
    private String comentariosEmPeComApoio;
    @Enumerated
    @NotNull
    private com.equoterapia.domain.enums.EquilibrioEstatico posicaoDeSentinelaOlhosAbertos;
    @NotBlank
    private String comentariosPosicaoDeSentinelaOlhosAbertos;
    @Enumerated
    @NotNull
    private com.equoterapia.domain.enums.EquilibrioEstatico posicaoDeSentinelaOlhosFechados;
    @NotBlank
    private String comentariosPosicaoDeSentinelaOlhosFechados;
    @Enumerated
    @NotNull
    private com.equoterapia.domain.enums.EquilibrioEstatico umPeOlhosAbertos;
    @NotBlank
    private String comentariosUmPeOlhosAbertos;
    @Enumerated
    @NotNull
    private com.equoterapia.domain.enums.EquilibrioEstatico umPeOlhosFechados;
    @NotBlank
    private String comentariosUmPeOlhosFechados;

    @OneToOne
    @JoinColumn(name = "avaliacao_fisioterapeutica_id")
    private AvaliacaoFisioterapeutica avaliacaoFisioterapeutica;

}
