package com.equoterapia.domain.repository.paciente;

import com.equoterapia.domain.model.paciente.fichaCadastroAdmissional.DadosPessoais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DadosPessoaisRepository extends JpaRepository<DadosPessoais, Long> {

    public Optional<DadosPessoais> findByCPF(String cpf);
}
