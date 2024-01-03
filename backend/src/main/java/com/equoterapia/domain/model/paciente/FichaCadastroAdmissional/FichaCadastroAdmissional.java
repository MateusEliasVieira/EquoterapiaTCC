package com.equoterapia.domain.model.paciente.formularioDeInscricaoDeAdmissao;

import com.equoterapia.domain.model.paciente.Paciente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FichaCadastroAdmissional {

    // Ficha Cadastral - Admissional CE

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFichaCadastroAdmissional;
    private Date dataAvaliacao; // Data da avaliação

    @OneToOne(mappedBy = "fichaCadastroAdmissional")
    private DadosPessoais dadosPessoais;

    @OneToOne(mappedBy = "fichaCadastroAdmissional")
    private com.equoterapia.domain.model.patient.admissionRegistrationForm.EducacaoPaciente educacaoPaciente;

    @OneToOne(mappedBy = "fichaCadastroAdmissional")
    private com.equoterapia.domain.model.patient.admissionRegistrationForm.ResponsavelPaciente responsavelPaciente;

    @OneToOne(mappedBy = "fichaCadastroAdmissional")
    private com.equoterapia.domain.model.patient.admissionRegistrationForm.OutrasAtividadesManha outrasAtividadesManha;

    @OneToOne(mappedBy = "fichaCadastroAdmissional")
    private com.equoterapia.domain.model.patient.admissionRegistrationForm.OutrasAtividadesTarde outrasAtividadesTarde;

    private String observacao; // Sobre horário desejado das sessões de equoterapia

    @OneToOne(mappedBy = "fichaCadastroAdmissional")
    private com.equoterapia.domain.model.patient.admissionRegistrationForm.Emergencia emergencia;

    @OneToOne(mappedBy = "fichaCadastroAdmissional")
    private com.equoterapia.domain.model.patient.admissionRegistrationForm.CompletudeMatricula completudeMatricula;

    @OneToOne
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;
}

