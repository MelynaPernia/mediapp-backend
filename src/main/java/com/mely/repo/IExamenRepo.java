package com.mely.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mely.model.Examen;

public interface IExamenRepo extends JpaRepository<Examen, Integer>{

}
