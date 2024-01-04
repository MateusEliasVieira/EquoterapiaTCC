package com.equoterapia.domain.model.paciente.FichaCadastroAdmissional;

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
public class OutrasAtividadesTarde {

    // Cronograma de atividade do paciente em outras instituições período vespertino

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOutrasAtividadesTarde;
    private String segundaFeira;
    private String tercaFeira;
    private String quartaFeira;
    private String quintaFeira;
    private String sextaFeira;
    private String sabado;
    private String domingo;

    @OneToOne
    @JoinColumn(name = "ficha_cadastro_admissional_id")
    private FichaCadastroAdmissional fichaCadastroAdmissional;

}

