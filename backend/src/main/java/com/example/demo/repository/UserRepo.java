package com.example.demo.repository;

import com.example.demo.models.ModelUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<ModelUser, Long> {
    ModelUser findByEmail(String email);
}
