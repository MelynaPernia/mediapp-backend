package com.mely.service.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mely.model.Examen;
import com.mely.repo.IExamenRepo;
import com.mely.service.IExamenService;

@Service
public class ExamenServiceImpl implements IExamenService{
	@Autowired
	private IExamenRepo repo;

	@Override
	public void registrar(Examen ex) {
		// TODO Auto-generated method stub
		repo.save(ex);
		
	}

	@Override
	public void modificar(Examen ex) {
		// TODO Auto-generated method stub
		repo.save(ex);
		
	}

	@Override
	public List<Examen> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void eliminar(Integer idExamen) {
		// TODO Auto-generated method stub
		repo.deleteById(idExamen);
		
	}

	@Override
	public Examen leerPorId(Integer idExamen) {
		// TODO Auto-generated method stub
		Optional<Examen> ex = repo.findById(idExamen);
		return ex.get();
	}
	
}
