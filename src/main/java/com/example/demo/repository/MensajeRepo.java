package com.example.demo.repository;

import com.example.demo.controllers.dto.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface MensajeRepo extends JpaRepository<Mensaje, UUID> {
    @Query("SELECT u from Mensaje u WHERE u.FK_USUARIO=?1")
    List<Mensaje> buscarPorusuario(String nombre);
}
