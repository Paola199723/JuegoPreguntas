package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.query.criteria.internal.predicate.IsEmptyPredicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.JugadorModel;
import com.example.demo.service.JuagdorService;

@RestController
public class JugadorController {
	
	@Autowired
	private JuagdorService Servicio;
	
	@PostMapping("/usuario")
	public Map<String, Object> GuardarUsuario(@RequestBody JugadorModel jugador) {
		if(BuscarJugador(jugador.getUsuario()).equals("Usuario sin registrar")) {
			Servicio.GuardarJugador(jugador);
			return respuesta(HttpStatus.OK, "Jugador registrado exitosamente");//200
		}else {
			return respuesta(HttpStatus.NOT_ACCEPTABLE, "Usuario ya existe");
		}
	}
	
	@PutMapping("/jugador/premio/{id}")
	public ResponseEntity<?> actualizarPremio(@RequestBody JugadorModel jugador, @PathVariable Integer id){
		try {
			JugadorModel jugadorExistente = Servicio.ObtenerJugadorPorId(id);
			jugadorExistente.setPremio(jugador.getPremio());
			Servicio.GuardarJugador(jugadorExistente);
			return new ResponseEntity<JugadorModel>(HttpStatus.OK);//200
		} catch (Exception e) {
			return new ResponseEntity<JugadorModel>(HttpStatus.NOT_FOUND);//404
			// TODO: handle exception
		}
	}
	
	public static Map<String, Object> respuesta(HttpStatus status, String msg) {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("msg", msg);
        respuesta.put("status", status);
        return respuesta;
    }
	
	public String BuscarJugador(String User) {
		List<JugadorModel> jugadores = Servicio.listarJugador();
		int i =0;
		while(jugadores.size()>i) {
			if(User.equals(jugadores.get(i).getUsuario())) {
				return "Usuario regsitrado";
			}
			i++;
		}
		return "Usuario sin registrar";
	}
		
	

}
