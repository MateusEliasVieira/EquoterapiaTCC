package com.equoterapia.domain.model.paciente;

import com.equoterapia.domain.model.usuario.Usuario;

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

    // Avaliação Fisioterapeutica

    @OneToOne(mappedBy = "paciente")
    private com.equoterapia.domain.model.paciente.avaliacaoFisioterapeutica.AvaliacaoFisioterapeutica avaliacaoFisioterapeutica;
    @OneToOne(mappedBy = "paciente")
    private com.equoterapia.domain.model.paciente.avaliacaoFisioterapeutica.CoordenacaoMotora coordenacaoMotora;
    @OneToOne(mappedBy = "paciente")
    private com.equoterapia.domain.model.paciente.avaliacaoFisioterapeutica.EquilibrioDinamico equilibrioDinamico;
    @OneToOne(mappedBy = "paciente")
    private com.equoterapia.domain.model.paciente.avaliacaoFisioterapeutica.EquilibrioEstatico equilibrioEstatico;
    @OneToOne(mappedBy = "paciente")
    private com.equoterapia.domain.model.paciente.avaliacaoFisioterapeutica.FormaDeComunicacao formaDeComunicacao;
    @OneToOne(mappedBy = "paciente")
    private com.equoterapia.domain.model.patient.physicalTherapyAssessment.GruposMusculares gruposMusculares;
    @OneToOne(mappedBy = "paciente")
    private com.equoterapia.domain.model.paciente.avaliacaoFisioterapeutica.HabilidadesMotorasAVD habilidadesMotorasAVD;
    @OneToOne(mappedBy = "paciente")
    private com.equoterapia.domain.model.patient.physicalTherapyAssessment.MobilidadeArticular mobilidadeArticular;
    @OneToOne(mappedBy = "paciente")
    private com.equoterapia.domain.model.paciente.avaliacaoFisioterapeutica.QuadroAtual quadroAtual;
    @OneToOne(mappedBy = "paciente")
    private com.equoterapia.domain.model.paciente.avaliacaoFisioterapeutica.SaudeGeralDosPacientes saudeGeralDosPacientes;

    // Avaliação Psicológica

    // Ficha Cadastro Admissional

    // Plano Terapeutico Singular


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

}
