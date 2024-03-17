package com.equoterapia.api.dto.paciente.avaliacaoPsicologica;

import com.equoterapia.domain.enums.PreencherLegenda;
import com.equoterapia.domain.model.paciente.Paciente;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Compreensao {

    // Compreensão

    private Long idCompreensao;
    @Enumerated @NotBlank
    private PreencherLegenda compreendeOrdens;
    @Enumerated @NotBlank
    private PreencherLegenda executaOrdensVerbaisSimples;
    @Enumerated @NotBlank
    private PreencherLegenda executaOrdensComplexas;


    private Paciente paciente;

}
