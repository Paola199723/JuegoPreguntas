package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Preguntas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer Nivel;
	String Categoria;
	String pregunta;
	String Respuesta;
	String Opcion1;
	String Opcion2;
	String Opcion3;

	
	
	public Preguntas(Integer nivel, String categoria, String pregunta, String respuesta, String opcion1, String opcion2,
			String opcion3) {
		super();
		Nivel = nivel;
		Categoria = categoria;
		this.pregunta = pregunta;
		Respuesta = respuesta;
		Opcion1 = opcion1;
		Opcion2 = opcion2;
		Opcion3 = opcion3;
		
	}
	
	public Preguntas() {
		super();
	}
	
	
	public Integer getNivel() {
		return Nivel;
	}
	public void setNivel(Integer nivel) {
		Nivel = nivel;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	public String getPregunta() {
		return pregunta;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	public String getRespuesta() {
		return Respuesta;
	}
	public void setRespuesta(String respuesta) {
		Respuesta = respuesta;
	}
	public String getOpcion1() {
		return Opcion1;
	}
	public void setOpcion1(String opcion1) {
		Opcion1 = opcion1;
	}
	public String getOpcion2() {
		return Opcion2;
	}
	public void setOpcion2(String opcion2) {
		Opcion2 = opcion2;
	}
	public String getOpcion3() {
		return Opcion3;
	}
	public void setOpcion3(String opcion3) {
		Opcion3 = opcion3;
	}


}
