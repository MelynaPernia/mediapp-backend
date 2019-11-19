package com.mely.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mely.model.Consulta;
import com.mely.repo.IConsultaRepo;
import com.mely.service.IConsultaService;

@Service
public class ConsultaServiceImpl implements IConsultaService {
	@Autowired
	private IConsultaRepo repo;

	@Override
	public Consulta registrar(Consulta t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Consulta modificar(Consulta t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Consulta leerPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Consulta> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}


	
	
	
}
