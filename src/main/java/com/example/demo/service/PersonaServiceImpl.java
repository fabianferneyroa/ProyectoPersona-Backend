package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.entity.Persona;
import com.example.demo.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService{
	
	@Autowired
	PersonaRepository personaRepository;

	@Override
	public Optional<Persona> findById(Float id) {
		// TODO Auto-generated method stub
		return personaRepository.findById(id);
	}

	@Override
	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		return personaRepository.findAll();
	}

	@Override
	public Persona save(Persona persona) {
		// TODO Auto-generated method stub
		return personaRepository.save(persona);
	}

	@Override
	public void deleteByID(Float id) {
		// TODO Auto-generated method stub
		
		personaRepository.deleteById(id);
		
	}

}
