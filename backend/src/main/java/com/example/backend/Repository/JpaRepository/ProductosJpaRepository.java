package com.example.backend.Repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.Repository.Entities.ProductosEntity;

public interface ProductosJpaRepository extends JpaRepository<ProductosEntity, Long>{}
