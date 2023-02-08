package com.palmazon.Palmazon.service;

import com.palmazon.Palmazon.model.Usuario;
import com.palmazon.Palmazon.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> getUsuarios(){
        return usuarioRepository.findAll();
    }

    @Override

    public Optional<Usuario> getUsuarioById(Integer id){
        return usuarioRepository.findById(id);
    }

    @Override
    public void setUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }
    @Override
    public void updateUsuario(Integer id, Usuario usuario){
        Usuario old_user = getUsuarioById(id).orElseThrow();
        old_user.setNombre(usuario.getNombre());
        old_user.setUsername(usuario.getUsername());
        old_user.setEmail(usuario.getEmail());
        old_user.setDireccion(usuario.getDireccion());
        old_user.setTelefono(usuario.getTelefono());
        old_user.setTipo(usuario.getTipo());
        old_user.setPassword(usuario.getPassword());
        old_user.setProductos(usuario.getProductos());
        old_user.setOrdenes(usuario.getOrdenes());
        usuarioRepository.save(old_user);
    }

    @Override
    public void deleteUsuarioById(Integer id){
        usuarioRepository.deleteById(id);
    }
}
