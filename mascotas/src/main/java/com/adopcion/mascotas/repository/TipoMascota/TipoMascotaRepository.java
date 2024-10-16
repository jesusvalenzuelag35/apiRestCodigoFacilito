package com.adopcion.mascotas.repository.TipoMascota;

import com.adopcion.mascotas.entidades.TipoMascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoMascotaRepository extends JpaRepository<TipoMascota,Long> {
}
