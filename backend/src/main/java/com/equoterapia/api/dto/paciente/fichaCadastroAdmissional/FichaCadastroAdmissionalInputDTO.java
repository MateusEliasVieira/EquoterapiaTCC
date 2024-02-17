package com.equoterapia.domain.model.paciente.fichaCadastroAdmissional;

import com.equoterapia.domain.model.paciente.Paciente;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class FichaCadastroAdmissional {

    // Ficha Cadastral - Admissional CE

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFichaCadastroAdmissional;
    private Date dataAvaliacao; // Data da avaliação

    @OneToOne(mappedBy = "fichaCadastroAdmissional", cascade = CascadeType.ALL)
    private DadosPessoais dadosPessoais;

    @OneToOne(mappedBy = "fichaCadastroAdmissional", cascade = CascadeType.ALL)
    private EducacaoPaciente educacaoPaciente;

    @OneToOne(mappedBy = "fichaCadastroAdmissional", cascade = CascadeType.ALL)
    private ResponsavelPaciente responsavelPaciente;

    @OneToOne(mappedBy = "fichaCadastroAdmissional", cascade = CascadeType.ALL)
    private OutrasAtividadesManha outrasAtividadesManha;

    @OneToOne(mappedBy = "fichaCadastroAdmissional", cascade = CascadeType.ALL)
    private OutrasAtividadesTarde outrasAtividadesTarde;

    private String observacao; // Sobre horário desejado das sessões de equoterapia

    @OneToOne(mappedBy = "fichaCadastroAdmissional", cascade = CascadeType.ALL)
    private Emergencia emergencia;

    @OneToOne(mappedBy = "fichaCadastroAdmissional", cascade = CascadeType.ALL)
    private CompletudeMatricula completudeMatricula;

    @OneToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;
}

