package com.adopcion.mascotas.service.Mascotas.Impl;

import com.adopcion.mascotas.entidades.Mascota;
import com.adopcion.mascotas.repository.Mascotas.MascotasRepository;
import com.adopcion.mascotas.service.Mascotas.MascotasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotasServiceImpl implements MascotasService {

    @Autowired
    private MascotasRepository mascotasRepository;

    @Override
    public Mascota crearMascota(Mascota mascota) {
        return mascotasRepository.save(mascota);
    }
}
