package com.adopcion.mascotas.repository.Mascotas;

import com.adopcion.mascotas.entidades.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MascotasRepository extends JpaRepository<Mascota,Long> {

    List<Mascota> findBydisponibleTrue();
}
