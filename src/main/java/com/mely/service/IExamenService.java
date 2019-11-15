package com.mely.service;

import java.util.List;

import com.mely.model.Examen;

public interface IExamenService {
	void registrar(Examen ex);
	void modificar(Examen ex);
	List<Examen> listar();
	void eliminar(Integer idExamen);
	Examen leerPorId(Integer idExamen);
	
}
