package com.adopcion.mascotas.service.TipoMascota.Impl;

import com.adopcion.mascotas.entidades.TipoMascota;
import com.adopcion.mascotas.repository.TipoMascota.TipoMascotaRepository;
import com.adopcion.mascotas.service.TipoMascota.TipoMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoMascotaServiceImpl implements TipoMascotaService {

    @Autowired
    private TipoMascotaRepository tipoMascotaRepository;

    @Override
    public TipoMascota crearTipoMascota(TipoMascota tipoMascota) {
        return tipoMascotaRepository.save(tipoMascota);
    }
}
