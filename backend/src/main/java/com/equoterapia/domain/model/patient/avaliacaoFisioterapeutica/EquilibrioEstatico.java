package com.equoterapia.domain.model.patient.physicalTherapyAssessment;

import com.equoterapia.domain.enums.StaticBalance;
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

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquilibrioEstatico;
    @Enumerated @NotNull
    private EquilibrioEstatico apoioCabeca;
    @NotBlank
    private String comentariosApoioCabeca;
    @Enumerated @NotNull
    private EquilibrioEstatico sentarSemApoio;
    @NotBlank
    private String comentariosSentarSemApoio;
    @Enumerated @NotNull
    private EquilibrioEstatico sentarComApoio;
    @NotBlank
    private String comentariosSentarComApoio;
    @Enumerated @NotNull
    private EquilibrioEstatico emPeSemApoio;
    @NotBlank
    private String comentariosEmPeSemApoio;
    @Enumerated @NotNull
    private EquilibrioEstatico emPeComApoio;
    @NotBlank
    private String comentariosEmPeComApoio;
    @Enumerated @NotNull
    private EquilibrioEstatico posicaoDeSentinelaOlhosAbertos;
    @NotBlank
    private String comentariosPosicaoDeSentinelaOlhosAbertos;
    @Enumerated @NotNull
    private EquilibrioEstatico posicaoDeSentinelaOlhosFechados;
    @NotBlank
    private String comentariosPosicaoDeSentinelaOlhosFechados;
    @Enumerated @NotNull
    private EquilibrioEstatico umPeOlhosAbertos;
    @NotBlank
    private String comentariosUmPeOlhosAbertos;
    @Enumerated @NotNull
    private EquilibrioEstatico umPeOlhosFechados;
    @NotBlank
    private String comentariosUmPeOlhosFechados;

    @OneToOne
    @JoinColumn(name = "id_avaliacao_fisioterapia")
    private AvaliacaoFisioterapia avaliacaoFisioterapia;

}
