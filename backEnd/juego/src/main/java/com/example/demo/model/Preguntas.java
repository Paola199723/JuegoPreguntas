package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Preguntas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idPreguntas;
	int Nivel;
	String Categoria;
	String Respuesta;
	String Opcion1;
	String Opcion2;
	String Opcion3;
	String Opcion4;
	
	public Preguntas( int nivel, String categoria, String respuesta, String opcion1, String opcion2,
			String opcion3, String opcion4) {
		super();
		Nivel = nivel;
		Categoria = categoria;
		Respuesta = respuesta;
		Opcion1 = opcion1;
		Opcion2 = opcion2;
		Opcion3 = opcion3;
		Opcion4 = opcion4;
	}
	
	public Preguntas() {
		super();
		
	}

	public Integer getIdPreguntas() {
		return idPreguntas;
	}

	public void setIdPreguntas(Integer idPreguntas) {
		this.idPreguntas = idPreguntas;
	}

	public int getNivel() {
		return Nivel;
	}

	public void setNivel(int nivel) {
		Nivel = nivel;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
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

	public String getOpcion4() {
		return Opcion4;
	}

	public void setOpcion4(String opcion4) {
		Opcion4 = opcion4;
	}
	

}
