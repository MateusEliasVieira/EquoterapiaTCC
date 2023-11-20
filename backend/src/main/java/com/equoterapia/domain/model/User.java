package com.equoterapia.domain.model;

import com.equoterapia.domain.enums.Bond;
import com.equoterapia.domain.enums.MaritalState;
import com.equoterapia.domain.enums.Role;
import com.equoterapia.domain.model.patient.Patient;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    @NotBlank @Size(min = 4)
    private String name;
    @Column(columnDefinition = "text", nullable = true)
    private String picture;
    @NotBlank @Size(min = 8, max = 10)
    private Date dateOfBirth;
    @NotBlank @CPF
    private String cpf;
    @NotBlank
    private MaritalState maritalState;
    @NotBlank
    private String phone;
    @NotBlank @Email
    private String email;
    @NotBlank @Size(min = 6, max = 50)
    private String username;
    @NotBlank @Size(min = 6, max = 100)
    private String password;
    @NotNull @Column(columnDefinition = "text")
    private String trainingDetail;
    @NotBlank
    private String city;
    @NotBlank
    private String neighborhood;
    @NotBlank
    private String publicPlace;
    @NotNull
    private Role role;
    @NotNull
    private Bond bond;
    @NotNull
    private Boolean hasTraining;
    @Column(columnDefinition = "text") @NotBlank
    private String token;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Patient> patientList;

}
