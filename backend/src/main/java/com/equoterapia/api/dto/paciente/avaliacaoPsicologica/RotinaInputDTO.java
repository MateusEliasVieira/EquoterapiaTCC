package com.equoterapia.api.dto.paciente.avaliacaoPsicologica;

import com.equoterapia.domain.model.paciente.Paciente;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Rotina {

    // Rotina

    private Long idRotina;
    @NotBlank
    private String brincadeiras;
    @NotBlank
    private String preferenciasPorBrincadeiras;
    @NotBlank
    private Boolean aceitaMudancasNaRotina;
    @NotBlank
    private String consideracoesSobreRotina;

    private Paciente paciente;

}

