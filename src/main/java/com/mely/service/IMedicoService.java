package com.mely.service;

import java.util.List;

import com.mely.model.Medico;



public interface IMedicoService {
	void registrar(Medico med);
	void modificar(Medico med);
	List<Medico> listar();
	
	Medico leerPorId(Integer id);
	
	void eliminar(Integer id);
}
