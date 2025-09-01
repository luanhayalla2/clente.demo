package com.example.demo.repository;

import com.example.demo.model.cliente;

import org.springframework.data.jpa.repository.JpaRepository;


public interface clienteRepository extends JpaRepository<cliente, Long> {

}


