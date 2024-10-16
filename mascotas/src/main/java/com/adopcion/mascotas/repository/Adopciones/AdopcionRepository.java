package com.adopcion.mascotas.repository.Adopciones;

import com.adopcion.mascotas.entidades.Adopcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdopcionRepository extends JpaRepository<Adopcion,Long> {

}
