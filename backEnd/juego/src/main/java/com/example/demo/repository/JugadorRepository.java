package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.JugadorModel;

public interface JugadorRepository extends JpaRepository<JugadorModel, Integer>{

}
