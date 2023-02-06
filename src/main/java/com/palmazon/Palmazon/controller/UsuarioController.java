package com.palmazon.Palmazon.controller;

import com.palmazon.Palmazon.model.Usuario;
import com.palmazon.Palmazon.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/all")
    public ArrayList<Usuario> getUsuarios(){
        return usuarioService.getUsuarios();
    }

    @PostMapping("/add")
    public void setUsuario(@RequestBody Usuario usuario){
        usuarioService.setUsuario(usuario);
    }

}
