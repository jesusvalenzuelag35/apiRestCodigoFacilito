package com.adopcion.mascotas.controller;

import com.adopcion.mascotas.entidades.Usuario;
import com.adopcion.mascotas.service.Usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuariosController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("crear")
    public Usuario crearUsuario(@RequestBody() Usuario usuario)
    {
        return usuarioService.crearUsuario(usuario);
    }

    @GetMapping("todos/los/usuarios")
    public List<Usuario> obtenerTodoslosUsuarios()
    {
        return usuarioService.buscarUsuarios();
    }
}
