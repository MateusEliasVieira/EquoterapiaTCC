package com.equoterapia.domain.model.patient;

import com.equoterapia.domain.model.User;
import com.equoterapia.domain.model.patient.admissionRegistrationForm.*;
import com.equoterapia.domain.model.patient.physicalTherapyAssessment.PhysicalTherapyAssessment;
import com.equoterapia.domain.model.patient.psychologicalAssessment.PsychologicalAssessment;
import com.equoterapia.domain.model.patient.uniqueTherapeuticPlan.UniqueTherapeuticPlan;
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
    private FormularioRegistroAdmissao formularioRegistroAdmissao;

    @OneToOne(mappedBy = "paciente")
    private AvaliacaoPsicologica avaliacaoPsicologica;

    @OneToOne(mappedBy = "paciente")
    private AvaliacaoFisioterapia avaliacaoFisioterapia;

    @OneToOne(mappedBy = "paciente")
    private PlanoTerapeuticoSingular planoTerapeuticoSingular;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

}
