package com.example.demo.repository;

import com.example.demo.entities.Partida;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PartidaRepo extends JpaRepository <Partida, UUID> {
    List<Partida> findByCiudad(String ciudad);
}
