package com.equoterapia.api.dto.paciente.avaliacaoPsicologica;

import com.equoterapia.domain.model.paciente.Paciente;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AvaliacaoPsicologica {

    // Avaliação dos aspectos psicológicos

    private Long idAvaliacaoPsicologica;

    private String expectativasFamiliaresTerapiaEquina;
    private String resumoCasoObservacoesComplementares;

    private String imagemAssinaturaOuCRPECarimbo;

    private Paciente paciente;

}
