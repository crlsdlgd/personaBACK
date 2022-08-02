package com.carlosdelgado.service;

import com.carlosdelgado.model.Persona;
import com.carlosdelgado.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService{

	@Autowired
	private PersonaRepository personaRepository;

	public List<Persona> findAll() {
		return personaRepository.findAll();
	}

	public <S extends Persona> S save(S entity) {
		return personaRepository.save(entity);
	}

	public Optional<Persona> findById(Long id) {
		return personaRepository.findById(id);
	}

	public void deleteById(Long id) {
		personaRepository.deleteById(id);
		
	}

}
