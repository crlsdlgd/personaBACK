package com.carlosdelgado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosdelgado.model.Estado;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{

}
