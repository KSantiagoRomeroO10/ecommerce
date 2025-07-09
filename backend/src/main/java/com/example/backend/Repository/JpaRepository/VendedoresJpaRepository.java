package com.example.backend.Repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.backend.Repository.Entities.VendedoresEntity;

public interface VendedoresJpaRepository extends JpaRepository<VendedoresEntity, Long> {}
