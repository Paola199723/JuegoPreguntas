package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Preguntas;
import com.example.demo.repository.PreguntasRepository;

@Service
public class PreguntaService {
	@Autowired
	PreguntasRepository repositorio;

	
	public List<Preguntas> listarPreguntas(){
		return repositorio.findAll();
	}
	
	public Preguntas Guardar(Preguntas preguntas){
		return repositorio.save(preguntas);
	}
	
	
	
}
