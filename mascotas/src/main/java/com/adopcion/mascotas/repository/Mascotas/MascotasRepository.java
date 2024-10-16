package com.adopcion.mascotas.repository.Mascotas;

import com.adopcion.mascotas.entidades.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotasRepository extends JpaRepository<Mascota,Long> {
}
