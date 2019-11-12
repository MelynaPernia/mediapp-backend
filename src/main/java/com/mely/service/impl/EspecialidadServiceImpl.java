package com.mely.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mely.model.Especialidad;
import com.mely.repo.IEspecialidadRepo;
import com.mely.service.IEspecialidadService;

@Service
public class EspecialidadServiceImpl implements IEspecialidadService {
	@Autowired
	private IEspecialidadRepo repo;

	@Override
	public void registrar(Especialidad esp) {
		// TODO Auto-generated method stub
		repo.save(esp);		
	}

	@Override
	public void modificar(Especialidad esp) {
		// TODO Auto-generated method stub
		repo.save(esp);		
	}

	@Override
	public List<Especialidad> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Especialidad leerPorId(Integer id) {
		// TODO Auto-generated method stub
		Optional<Especialidad> esp = repo.findById(id);
		return esp.get();
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);		
	}
	
	
}
