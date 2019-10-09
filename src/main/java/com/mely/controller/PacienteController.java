package com.mely.controller;

import java.util.List;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.mely.model.Paciente;
import com.mely.service.IPacienteService;

@RestController
public class PacienteController {
	
	@Autowired
	private IPacienteService service;
	
	@GetMapping("/paciente")
	public List<Paciente> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Paciente leerPorId(@PathVariable("id") Integer id){
		return service.leerPorId(id);
	}
	
	@PostMapping
	public void registrar(@Valid @RequestBody Paciente pac) {
		service.registrar(pac);
	}

	@PutMapping
	public void modificar(@Valid @RequestBody Paciente pac) {
		service.modificar(pac);
	}

}
