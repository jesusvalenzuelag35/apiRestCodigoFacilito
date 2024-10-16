package com.adopcion.mascotas.service.Adopcion.impl;

import com.adopcion.mascotas.entidades.Adopcion;
import com.adopcion.mascotas.repository.Adopciones.AdopcionRepository;
import com.adopcion.mascotas.service.Adopcion.AdopcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdopcionServiceImpl implements AdopcionService {

    @Autowired
    AdopcionRepository adopcionRepository;
    @Override
    public Adopcion crearAdopcion(Adopcion entidad) {
        return adopcionRepository.save(entidad);
    }
}
