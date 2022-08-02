package com.carlosdelgado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosdelgado.model.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
