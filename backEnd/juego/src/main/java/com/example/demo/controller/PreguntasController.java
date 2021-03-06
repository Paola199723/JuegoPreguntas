package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Preguntas;
import com.example.demo.service.PreguntaService;

@RestController
public class PreguntasController {
	
	@Autowired
	private PreguntaService repositorio;

	@GetMapping("/pregunta")
	public Map<String, Object> obtenerPreguntas(@RequestBody Preguntas preguntas) {
		List<Preguntas> pregunta = repositorio.listarPreguntas();
		Map<String, Object> respuesta = new HashMap<>();
		List<Preguntas> response = new ArrayList<Preguntas>();
		
		int i=0;
		while(i<pregunta.size()){
			//buscamos la categoria
			if(pregunta.get(i).getCategoria().equals(preguntas.getCategoria())) {
				//buscamos el nivel
				if(pregunta.get(i).getNivel().equals(preguntas.getNivel())) {
					
					respuesta.put("Opcion3",pregunta.get(i).getOpcion3());
					respuesta.put("Opcion2",pregunta.get(i).getOpcion2());
					respuesta.put("Opcion1",pregunta.get(i).getOpcion1());
					respuesta.put("Respuesta",pregunta.get(i).getRespuesta());
					respuesta.put("Pregunta",pregunta.get(i).getPregunta());
					
				}
			}
			i++;
		}
		//datos = response;
		return respuesta;
	}
	
	@GetMapping("/categoria")
	public Map<String, Object> ObtenerTodo() {
		List<Preguntas> pregunta = repositorio.listarPreguntas();
		List<String> categorias = new ArrayList<String>();
		Map<String, Object> respuesta = new HashMap<>();
		int i=0, cont=0, cont2 = 0;
		
		while(i<pregunta.size()){
			//buscamos la categoria
			
			if(categorias.isEmpty()) {
				categorias.add(pregunta.get(i).getCategoria().toString());
				cont++;
			}
			while(cont2<categorias.size()) {
				if(!categorias.get(cont2).equals(pregunta.get(i).getCategoria().toString())) {
					categorias.add(pregunta.get(i).getCategoria().toString());
				}
			}
			cont2=0;
			i++;
		}
		respuesta.put("Categoria: ",categorias);
		//datos = response;
		return respuesta;
		
	}
	
	
	
	@PostMapping("/pregunta/registro")
	public void GuardarPreguntas(@RequestBody Preguntas preguntas) {
		List<Preguntas> pregunta = repositorio.listarPreguntas();
		if(pregunta.isEmpty()) {
			repositorio.Guardar(preguntas);
		}
	}
}
