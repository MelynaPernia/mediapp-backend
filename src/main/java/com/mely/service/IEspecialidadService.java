package com.mely.service;

import java.util.List;

import com.mely.model.Especialidad;

public interface IEspecialidadService {
	void registrar(Especialidad esp);
	void modificar(Especialidad esp);
	List<Especialidad> listar();
	Especialidad leerPorId(Integer id);
	void eliminar(Integer id);	
}
