package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.JugadorModel;
import com.example.demo.model.Preguntas;

public interface PreguntasRepository extends JpaRepository<Preguntas, Integer >{

}
