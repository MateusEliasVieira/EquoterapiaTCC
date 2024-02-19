package com.equoterapia.api.dto.paciente.fichaCadastroAdmissional;

import com.equoterapia.domain.enums.ClasseDeEscola;
import com.equoterapia.domain.enums.Periodo;
import com.equoterapia.domain.enums.TipoDeInstituicaoEducacional;
import com.equoterapia.domain.model.paciente.Paciente;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EducacaoPacienteInputDTO {

    // Escolaridade do paciente

    private Long idEducacaoPaciente;
    @NotBlank
    private String serieEscolar;
    @Enumerated
    private ClasseDeEscola classeDeEscola;
    @NotBlank
    private String instituicaoEducacional;
    @Enumerated
    private TipoDeInstituicaoEducacional tipoDeInstituicaoEducacional;
    @Enumerated
    private Periodo periodo;


    private Paciente paciente;

}

