package com.mely.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mely.model.Consulta;

public interface IConsultaRepo extends JpaRepository<Consulta, Integer> {
	
}
