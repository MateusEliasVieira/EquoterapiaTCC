package com.equoterapia.domain.model.patient;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Patient implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPatient;
    private PersonalData personalData;
    // continue...
}
