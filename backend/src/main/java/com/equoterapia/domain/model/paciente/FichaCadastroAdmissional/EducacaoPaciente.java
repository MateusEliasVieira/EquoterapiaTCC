package com.equoterapia.domain.model.patient.admissionRegistrationForm;

import com.equoterapia.domain.enums.*;
import com.equoterapia.domain.model.patient.Patient;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EducacaoPaciente {

    // Escolaridade do paciente

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEducacaoPaciente;
    @NotBlank
    private String serieEscolar;
    @Enumerated
    private TurmaEscolar turmaEscolar;
    @NotBlank
    private String instituicaoEducacional;
    @Enumerated
    private TipoDeInstituicaoEducacional tipoDeInstituicaoEducacional;
    @Enumerated
    private Periodo periodo;

    @OneToOne
    @JoinColumn(name = "id_ficha_cadastro_admissional")
    private FichaCadastroAdmissional fichaCadastroAdmissional;

}

