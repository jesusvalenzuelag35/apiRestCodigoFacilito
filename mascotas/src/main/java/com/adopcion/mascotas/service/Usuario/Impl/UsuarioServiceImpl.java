package com.adopcion.mascotas.service.Usuario.Impl;

import com.adopcion.mascotas.entidades.Usuario;
import com.adopcion.mascotas.repository.Usuarios.UsuariosRepository;
import com.adopcion.mascotas.service.Usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return usuariosRepository.save(usuario);
    }

    @Override
    public List<Usuario> buscarUsuarios() {
        return usuariosRepository.findAll();
    }
}
