package com.mely.service.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mely.model.Paciente;
import com.mely.repo.IPacienteRepo;
import com.mely.service.IPacienteService;

@Service
public class PacienteServiceImpl implements IPacienteService {
	
	@Autowired
	private IPacienteRepo repo;

	@Override
	public void registrar(Paciente pac) {
		// TODO Auto-generated method stub
		repo.save(pac);
	}

	@Override
	public void modificar(Paciente pac) {
		// TODO Auto-generated method stub
		repo.save(pac);
	}

	@Override
	public List<Paciente> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Paciente leerPorId(Integer id) {
		Optional<Paciente> paciente = repo.findById(id);
		return paciente.get();
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
