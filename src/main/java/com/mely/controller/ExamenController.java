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

import com.mely.model.Examen;
import com.mely.model.Paciente;
import com.mely.service.IExamenService;

@RestController
@RequestMapping("/examen")
public class ExamenController {
	@Autowired
	private IExamenService service;
	
	@GetMapping
	private List<Examen> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	private Examen leerPorId(@PathVariable("id") Integer id) {
		Examen ex = service.leerPorId(id); 
		return ex;
	}
	
	@PostMapping
	private void registrar(@Valid @RequestBody Examen ex) {
		service.registrar(ex);		
	}
	
	@PutMapping
	private void modificar(@Valid @RequestBody Examen ex) {
		service.modificar(ex);
	}
	
	@DeleteMapping("/{id}")
	private void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
} 
