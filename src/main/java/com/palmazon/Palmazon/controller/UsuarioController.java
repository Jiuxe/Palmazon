package com.palmazon.Palmazon.controller;

import com.palmazon.Palmazon.model.Usuario;
import com.palmazon.Palmazon.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/all")
    public List<Usuario> getUsuarios(){
        return usuarioService.getUsuarios();
    }

    @GetMapping("/get/{id}")
    public Optional<Usuario> getUsuarioById(@PathVariable Integer id){
        return usuarioService.getUsuarioById(id);
    }

    @PostMapping("/add")
    public void setUsuario(@RequestBody Usuario usuario){
        usuarioService.setUsuario(usuario);
    }

    @PostMapping("/update/{id}")
    public void updateUsuario(@PathVariable Integer id, @RequestBody  Usuario usuario){
        usuarioService.updateUsuario(id, usuario);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUsuarioById(@PathVariable Integer id){
        usuarioService.deleteUsuarioById(id);
    }

}
