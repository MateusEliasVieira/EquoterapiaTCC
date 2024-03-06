package com.equoterapia.api.dto.paciente.avaliacaoPsicologica;

import com.equoterapia.domain.model.paciente.Paciente;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SobreACrianca {

    // Perguntas iniciais sobre a criança

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

    private Paciente paciente;

}

