package com.equoterapia.api.dto.paciente;

import com.equoterapia.api.dto.paciente.avaliacaoFisioterapeutica.SaudeGeralDosPacientes;
import com.equoterapia.api.dto.usuario.UsuarioInputDTO;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Paciente {

    private Long idPaciente;

    private SaudeGeralDosPacientes saudeGeralDosPacientes;

    private UsuarioInputDTO usuarioInputDTO;

}
