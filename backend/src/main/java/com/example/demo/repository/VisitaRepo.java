package com.example.demo.repository;

import com.example.demo.models.ModelVisita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitaRepo extends JpaRepository<ModelVisita, Long> { }
