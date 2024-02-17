package com.equoterapia.domain.model.paciente;

import com.equoterapia.domain.model.Usuario;
import com.equoterapia.domain.model.paciente.fichaCadastroAdmissional.FichaCadastroAdmissional;
import com.equoterapia.domain.model.paciente.avaliacaoFisioterapeutica.AvaliacaoFisioterapeutica;
import com.equoterapia.domain.model.paciente.avaliacaoPsicologica.AvaliacaoPsicologica;
import com.equoterapia.domain.model.paciente.planoTerapeuticoSingular.PlanoTerapeuticoSingular;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Paciente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaciente;

    @OneToOne(mappedBy = "paciente", cascade = CascadeType.ALL)
    private FichaCadastroAdmissional fichaCadastroAdmissional;

    @OneToOne(mappedBy = "paciente", cascade = CascadeType.ALL)
    private AvaliacaoPsicologica avaliacaoPsicologica;

    @OneToOne(mappedBy = "paciente", cascade = CascadeType.ALL)
    private AvaliacaoFisioterapeutica avaliacaoFisioterapeutica;

    @OneToOne(mappedBy = "paciente", cascade = CascadeType.ALL)
    private PlanoTerapeuticoSingular planoTerapeuticoSingular;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

}
