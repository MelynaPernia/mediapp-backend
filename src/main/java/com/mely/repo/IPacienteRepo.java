package com.mely.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mely.model.Paciente;

public interface IPacienteRepo extends JpaRepository<Paciente, Integer> {

}
