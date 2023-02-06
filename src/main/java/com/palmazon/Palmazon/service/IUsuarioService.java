package com.palmazon.Palmazon.service;

import com.palmazon.Palmazon.model.Usuario;

import java.util.ArrayList;

public interface IUsuarioService {

    public ArrayList<Usuario> getUsuarios();

    public void setUsuario(Usuario usuario);
}
