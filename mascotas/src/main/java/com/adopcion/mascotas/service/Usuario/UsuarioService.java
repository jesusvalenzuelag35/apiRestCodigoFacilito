package com.adopcion.mascotas.service.Usuario;

import com.adopcion.mascotas.entidades.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario crearUsuario(Usuario usuario);

    List<Usuario> buscarUsuarios();
}
