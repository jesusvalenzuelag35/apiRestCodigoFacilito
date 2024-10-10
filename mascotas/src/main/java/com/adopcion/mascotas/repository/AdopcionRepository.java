package com.adopcion.mascotas.repository;

import com.adopcion.mascotas.entidades.Adopcion;
import com.adopcion.mascotas.entidades.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdopcionRepository extends JpaRepository<Adopcion,Long> {

}
