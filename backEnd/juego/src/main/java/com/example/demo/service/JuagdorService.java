package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.JugadorModel;
import com.example.demo.repository.JugadorRepository;

@Service
public class JuagdorService {
	@Autowired
	private JugadorRepository repository;
	
	
	public List<JugadorModel> listarJugador(){
		return repository.findAll();
	}
	
	public void GuardarJugador(JugadorModel jugador) {
		repository.save(jugador);
	}
	
	public JugadorModel ObtenerJugadorPorId(Integer id) {
		return repository.findById(id).get();
	}
	
	
	
	public void GuardarPremio(JugadorModel jugador){
		repository.save(jugador);
	}
	
	
	

}
