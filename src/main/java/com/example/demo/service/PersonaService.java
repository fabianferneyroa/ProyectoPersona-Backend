package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.models.entity.Persona;

public interface PersonaService {
	
	public Optional<Persona> findById(Float id);
	
	public List<Persona> findAll();
	
	public Persona save(Persona persona);
	
	public void deleteByID(Float id);

}
