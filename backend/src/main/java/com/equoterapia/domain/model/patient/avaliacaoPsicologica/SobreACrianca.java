package com.equoterapia.domain.model.patient.psychologicalAssessment;

import com.equoterapia.domain.model.patient.Patient;
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
public class SobreACrianca {

    // Perguntas iniciais sobre a criança

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSobreACrianca;
    @NotNull
    private Boolean fezTerapiaEquina;
    @NotNull
    private Boolean criancaPlanejada;
    @NotNull
    private Boolean cuidadosPreNatais;
    @NotNull
    private Boolean chorouNoNascimento;
    private String alimentacao;
    private String observacao;

    @OneToOne
    @JoinColumn(name = "id_avaliacao_psicologica")
    private AvaliacaoPsicologica avaliacaoPsicologica;

}

