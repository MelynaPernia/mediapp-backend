package com.mely.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mely.model.Medico;
import com.mely.service.IMedicoService;



@RestController
@RequestMapping("/medico")
public class MedicoController {
	@Autowired
	private IMedicoService service;
	
	@GetMapping
	public List<Medico> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Medico leerPorId(@PathVariable("id") Integer id){
		//alskdmaslkd
		Medico medico = service.leerPorId(id); 
		return medico;
	}
	
	@PostMapping
	public void registrar(@Valid @RequestBody Medico med) {
		service.registrar(med);
	}

	@PutMapping
	public void modificar(@Valid @RequestBody Medico med) {
		service.modificar(med);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id")  Integer id) {
		service.eliminar(id);
		
	}
}
