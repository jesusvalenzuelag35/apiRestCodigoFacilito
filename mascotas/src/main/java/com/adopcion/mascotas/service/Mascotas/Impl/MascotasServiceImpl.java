package com.adopcion.mascotas.service.Mascotas.Impl;

import com.adopcion.mascotas.DTO.MascotaDTO;
import com.adopcion.mascotas.entidades.Mascota;
import com.adopcion.mascotas.repository.Mascotas.MascotasRepository;
import com.adopcion.mascotas.service.Mascotas.MascotasService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class MascotasServiceImpl implements MascotasService {

    private static final Logger log = LoggerFactory.getLogger(MascotasServiceImpl.class);
    @Autowired
    private MascotasRepository mascotasRepository;

    @Override
    public Mascota crearMascota(Mascota mascota) {
        return mascotasRepository.save(mascota);
    }

    @Override
    public List<Mascota> mascotasDisponibles() {
        List<Mascota> mascotasDisponibles = new ArrayList<>();
        try{
            mascotasDisponibles=  mascotasRepository.findBydisponibleTrue();

        }catch (Exception e)
        {
            log.error("ocurrio un errror a buscar mascotas disponibles: "+e.getMessage());
        }
         return mascotasDisponibles;
    }

    @Override
    public Mascota actualizarMascota(Long id, MascotaDTO mascota) {
        Mascota existeMascota = mascotasRepository.findById(id).orElse(new Mascota());
        Mascota actualizarMascota = new Mascota();
        if (existeMascota.getId() != null)
        {
            existeMascota.setNombre(mascota.getNombre());
            existeMascota.setEdad(mascota.getEdad());
            existeMascota.setDisponible(mascota.isDisponible());
            return mascotasRepository.save(existeMascota);
        }else
        {
            return new Mascota();
        }

    }

    @Override
    public String borrarMascota(Long id) {
        String mascotaBorrada = "";
        Mascota existeMascota = mascotasRepository.findById(id).orElse(new Mascota());
        if (existeMascota.getId() != null)
        {
            mascotasRepository.delete(existeMascota);
            mascotaBorrada = "Mascota borrada exitosamente";
        }else
        {
            mascotaBorrada = "no se logró borrar la mascota";
        }
        return mascotaBorrada;
    }


}
