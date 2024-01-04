package com.equoterapia.domain.model.paciente.planoTerapeuticoSingular;

import com.equoterapia.domain.model.paciente.Paciente;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PlanoTerapeuticoSingular {

    // Plano Terapêutico Singular (PTS)

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlanoTerapeuticoSingular;
    @NotBlank @NotNull @Size(min = 8, max = 10)
    private Date dataPlanejamento;
    @NotBlank
    private String responsavelTerapeutico;
    @NotBlank
    private String problema;
    @NotBlank
    private String justificativaHipotesesBiologicasSociaisEmocionais;
    @NotBlank
    private String objetivoTerapeutico;
    @NotBlank
    private String medida;
    @NotBlank
    private String estrategiasIntervencao;
    @NotBlank
    private String selasMediadorasAnimais;
    @NotBlank
    private String evolucao;
    @NotBlank
    private String imagemCarimboAssinaturaTerapeutas;

    @OneToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

}
