package com.example.backend.Repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.backend.Models.Ventas;

public interface VentasJpaRepository extends JpaRepository<Ventas, Long> {}
