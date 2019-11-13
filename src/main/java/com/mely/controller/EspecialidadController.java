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

import com.mely.model.Especialidad;
import com.mely.service.IEspecialidadService;

@RestController
@RequestMapping("/especialidad")
public class EspecialidadController {
	@Autowired
	private IEspecialidadService service;
	
	@GetMapping
	public List<Especialidad> listar(){
		return service.listar();
	}
	
	@PostMapping
	public void register(@Valid @RequestBody Especialidad esp) {
		service.registrar(esp);
	}
	
	@PutMapping
	public void modificar(@Valid @RequestBody Especialidad esp) {
		service.modificar(esp);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id")  Integer id) {
		service.eliminar(id);
		
	}
	

}
