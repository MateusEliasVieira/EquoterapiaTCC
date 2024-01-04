package com.equoterapia.domain.model.paciente;

import com.equoterapia.domain.model.Usuario;
import com.equoterapia.domain.model.paciente.FichaCadastroAdmissional.FichaCadastroAdmissional;
import com.equoterapia.domain.model.paciente.avaliacaoFisioterapeutica.AvaliacaoFisioterapeutica;
import com.equoterapia.domain.model.paciente.avaliacaoPsicologica.AvaliacaoPsicologica;
import com.equoterapia.domain.model.paciente.planoTerapeuticoSingular.PlanoTerapeuticoSingular;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Paciente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaciente;

    @OneToOne(mappedBy = "paciente")
    private FichaCadastroAdmissional fichaCadastroAdmissional;

    @OneToOne(mappedBy = "paciente")
    private AvaliacaoPsicologica avaliacaoPsicologica;

    @OneToOne(mappedBy = "paciente")
    private AvaliacaoFisioterapeutica avaliacaoFisioterapeutica;

    @OneToOne(mappedBy = "paciente")
    private PlanoTerapeuticoSingular planoTerapeuticoSingular;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

}
