package com.palmazon.Palmazon.repository;

import com.palmazon.Palmazon.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {


    @Query(value = "SELECT * FROM `palmazon-ecommerce`.usuarios",nativeQuery = true)
    public ArrayList<Usuario> getAllUsuarios();

    @Query(value = "INSERT INTO `palmazon-ecommerce`.usuarios (" +
            "nombre, username, email, direccion, telefono, tipo, password)" +
            "VALUES (usuario)", nativeQuery = true)
    public void setUsuario(Usuario usuario);
}
