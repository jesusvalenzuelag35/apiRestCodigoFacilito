package com.adopcion.mascotas.service.Mascotas;

import com.adopcion.mascotas.DTO.MascotaDTO;
import com.adopcion.mascotas.entidades.Mascota;

import java.util.List;

public interface MascotasService {

    Mascota crearMascota(Mascota mascota);

    List<Mascota> mascotasDisponibles();

    Mascota actualizarMascota(Long id, MascotaDTO mascota);

    String borrarMascota(Long id);
}
