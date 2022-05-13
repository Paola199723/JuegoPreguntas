package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.context.properties.bind.DefaultValue;

import net.bytebuddy.implementation.bind.annotation.Default;
@Entity
public class JugadorModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idjugador;
	private String Usuario;
	private Integer premio;
	
	
	public JugadorModel(String usuario, Integer premio) {
		super();
		Usuario = usuario;
		this.premio = premio;
	}
	
	public Integer getIdjugador() {
		return idjugador;
	}

	public void setIdjugador(Integer idjugador) {
		this.idjugador = idjugador;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public Integer getPremio() {
		return premio;
	}

	public void setPremio(Integer premio) {
		this.premio = premio;
	}

	public JugadorModel() {
		super();
	}
	
	
	
	
}
