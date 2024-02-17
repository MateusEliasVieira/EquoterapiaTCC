package com.equoterapia.domain.model.paciente.fichaCadastroAdmissional;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

import static com.equoterapia.utils.Feedback.ASSINATURA_IMAGEM;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CompletudeMatricula {

    // Sobre a efetivação da matrícula

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCompletudeMatricula;
    @NotBlank @NotNull @Size(min = 8, max = 10)
    private Date dataCompletudeMatricula;
    @NotBlank(message = ASSINATURA_IMAGEM)
    private String imagemAssinaturaResponsavel;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ficha_cadastro_admissional_id")
    private FichaCadastroAdmissional fichaCadastroAdmissional;

}

