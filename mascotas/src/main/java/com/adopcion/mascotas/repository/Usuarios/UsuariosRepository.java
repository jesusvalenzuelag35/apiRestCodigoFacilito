package com.adopcion.mascotas.repository.Usuarios;

import com.adopcion.mascotas.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuario,Long> {
}
