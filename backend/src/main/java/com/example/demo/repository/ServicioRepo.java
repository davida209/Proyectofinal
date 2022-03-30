package com.example.demo.repository;

import com.example.demo.models.ModelServicio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicioRepo extends JpaRepository<ModelServicio, Long> { }
