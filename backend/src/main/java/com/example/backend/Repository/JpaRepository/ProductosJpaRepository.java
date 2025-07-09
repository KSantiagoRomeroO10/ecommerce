package com.example.backend.Repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.Models.Productos;

public interface ProductosJpaRepository extends JpaRepository<Productos, Long>{}
