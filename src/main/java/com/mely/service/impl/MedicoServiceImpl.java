package com.mely.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mely.model.Medico;

import com.mely.repo.IMedicoRepo;

import com.mely.service.IMedicoService;

@Service
public class MedicoServiceImpl implements IMedicoService{
	@Autowired
	private IMedicoRepo repo;

	@Override
	public void registrar(Medico med) {
		// TODO Auto-generated method stub
		repo.save(med);
	}

	@Override
	public void modificar(Medico med) {
		// TODO Auto-generated method stub
		repo.save(med);
	}

	@Override
	public List<Medico> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Medico leerPorId(Integer id) {
		Optional<Medico> medico = repo.findById(id);
		return medico.get();
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
}
