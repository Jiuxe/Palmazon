package com.palmazon.Palmazon.repository;

import com.palmazon.Palmazon.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
