package com.example.demo.repository;

import com.example.demo.entities.Sugerencia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

public interface SugerenciaRepo extends JpaRepository <Sugerencia, UUID> {
    List<Sugerencia> findByDescription(String description);
}
