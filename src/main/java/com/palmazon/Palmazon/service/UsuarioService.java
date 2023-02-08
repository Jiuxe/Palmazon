package com.palmazon.Palmazon.service;

import com.palmazon.Palmazon.model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    List<Usuario> getUsuarios();

    Optional<Usuario> getUsuarioById(Integer id);

    void setUsuario(Usuario usuario);

    void updateUsuario(Integer id, Usuario usuario);

    void deleteUsuarioById(Integer id);
}
