package com.example.demo.repository;

import com.example.demo.entities.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface MensajeRepo extends JpaRepository<Mensaje, UUID> {
    //@Query("SELECT u from Mensaje u WHERE u.FK_USUARIO=?1")
    List<Mensaje> findByCreador(String creador);
}
