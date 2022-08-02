package com.carlosdelgado.service;

import com.carlosdelgado.model.Estado;
import com.carlosdelgado.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstadoService{
	//public class EstadoService implements EstadoRepository{
	@Autowired
	private EstadoRepository estadoRepository;

	public List<Estado> findAllByCountry(Long id){
		List<Estado> estadosRespuesta=new ArrayList<>();
		List<Estado> estados = estadoRepository.findAll();
		for(int i =0;i<estados.size();i++) {
			if(estados.get(i).getPais().getId()==id) {
				estadosRespuesta.add(estados.get(i));
			}
		}
		return estadosRespuesta;
	}

}
