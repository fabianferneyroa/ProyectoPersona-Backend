package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.entity.Persona;
import com.example.demo.service.PersonaService;

@RestController
@RequestMapping("/api/personaje")
@CrossOrigin(origins="*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class PersonaController {

	@Autowired
	PersonaService personaService;
	
	@GetMapping("/{id}")
	public Optional<Persona> buscarPorID(@PathVariable Float id){
		
		return personaService.findById(id);
		
	}
	
	@GetMapping("/listar")
	public List<Persona> buscarTodos(){
		
		return personaService.findAll();
		
	}
	
	@PostMapping
	public Persona registrar(@RequestBody Persona persona) {
		
		return personaService.save(persona);
		
	}
	
	@PutMapping("/actualizar/{id}")
	public Persona actualizar(@RequestBody Persona persona, @PathVariable Float id) {
		
		Persona personaBD = personaService.findById(id).get();
		
		personaBD.setNombrePersona(persona.getNombrePersona());
		personaBD.setApellidoPersona(persona.getApellidoPersona());
		personaBD.setDireccionPersona(persona.getDireccionPersona());
		personaBD.setTelefonoPersona(persona.getTelefonoPersona());
		
	     personaService.save(persona);
	     
	     return personaBD;
		
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Float id) {
		
		personaService.deleteByID(id);
		
	}
	
}
