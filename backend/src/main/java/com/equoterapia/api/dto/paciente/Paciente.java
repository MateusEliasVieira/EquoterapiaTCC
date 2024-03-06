package com.equoterapia.api.dto.paciente;

<<<<<<< HEAD
=======
import com.equoterapia.api.dto.paciente.avaliacaoFisioterapeutica.SaudeGeralDosPacientes;
import com.equoterapia.api.dto.usuario.UsuarioInputDTO;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
>>>>>>> 617bd977d20bfecdc5ed1efeaeea2248f0b8d649
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Paciente {

    private Long idPaciente;

<<<<<<< HEAD
=======
    private SaudeGeralDosPacientes saudeGeralDosPacientes;

    private UsuarioInputDTO usuarioInputDTO;

>>>>>>> 617bd977d20bfecdc5ed1efeaeea2248f0b8d649
}
