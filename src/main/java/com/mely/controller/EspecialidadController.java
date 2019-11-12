package com.mely.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
