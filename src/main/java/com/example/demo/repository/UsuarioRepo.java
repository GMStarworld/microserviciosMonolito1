package com.example.demo.repository;

import com.example.demo.controllers.dto.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface UsuarioRepo extends JpaRepository <Usuario, UUID> {
    @Query("SELECT u from Usuario u WHERE u.nombre=?1 AND u.apellidos=?2")
    List<Usuario> buscarNameandSurname(String nombre, String apellidos);

    @Query("SELECT u FROM usuario u WHERE u.nombre in(?1)")
    List<Usuario> buscarUsuarioname(String nombre);
}
