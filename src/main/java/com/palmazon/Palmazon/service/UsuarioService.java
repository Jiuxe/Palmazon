package com.palmazon.Palmazon.service;

import com.palmazon.Palmazon.model.Usuario;
import com.palmazon.Palmazon.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<Usuario> getUsuarios(){
        return usuarioRepository.getAllUsuarios();
    }

    public void setUsuario(Usuario usuario){
        usuarioRepository.setUsuario(usuario);
    }
}
