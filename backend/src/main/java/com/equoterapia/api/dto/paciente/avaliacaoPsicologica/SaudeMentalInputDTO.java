package com.equoterapia.api.dto.paciente.avaliacaoPsicologica;

import com.equoterapia.domain.enums.PreencherLegenda;
import com.equoterapia.domain.model.paciente.Paciente;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SaudeMental {

    // Saúde mental

    private Long idSaudeMental;
    @Enumerated @NotNull
    private PreencherLegenda apresentaConfusaoMental;
    @Enumerated @NotNull
    private PreencherLegenda apresentaDelirios;
    @Enumerated @NotNull
    private PreencherLegenda apresentaAlucinacoes;

    private Paciente paciente;

}
