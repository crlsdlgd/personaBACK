package com.carlosdelgado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosdelgado.model.Pais;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long>{

}
