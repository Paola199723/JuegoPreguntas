package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.JugadorModel;
import com.example.demo.model.Preguntas;
import com.example.demo.modelo.Producto;
import com.example.demo.repository.PreguntasRepository;
import com.example.demo.service.PreguntaService;

@RestController
public class PreguntasController {
	
	@Autowired
	private PreguntaService repositorio;

	@GetMapping("/pregunta")
	public Map obtenerPreguntas(@RequestBody Preguntas preguntas) {
		List<Preguntas> pregunta = repositorio.listarPreguntas();
		Map<String, Object> respuesta = new HashMap<>();
		List<Preguntas> response = new ArrayList<Preguntas>();
		
		int i=0;
		while(i<pregunta.size()){
			//buscamos la categoria
			if(pregunta.get(i).getCategoria().equals(preguntas.getCategoria())) {
				//buscamos el nivel
				if(pregunta.get(i).getNivel().equals(preguntas.getNivel())) {
					respuesta.put("Pregunta",pregunta.get(i).getPregunta());
					respuesta.put("Respuesta",pregunta.get(i).getRespuesta());
					respuesta.put("Opcion1",pregunta.get(i).getOpcion1());
					respuesta.put("Opcion2",pregunta.get(i).getOpcion2());
					respuesta.put("Opcion3",pregunta.get(i).getOpcion3());
				}
			}
			i++;
		}
		
		//datos = response;
		return respuesta;
	}
	
}
