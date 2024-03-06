package com.equoterapia.api.dto.paciente.fichaCadastroAdmissional;

import com.equoterapia.api.dto.paciente.Paciente;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FichaCadastroAdmissionalInputDTO {

    // Ficha Cadastral - Admissional CE

    private Long idFichaCadastroAdmissional;
    private Date dataAvaliacao; // Data da avaliação

    private Paciente paciente;
}

