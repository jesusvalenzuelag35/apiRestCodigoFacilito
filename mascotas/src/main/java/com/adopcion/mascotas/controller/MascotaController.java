package com.adopcion.mascotas.controller;

import com.adopcion.mascotas.DTO.MascotaDTO;
import com.adopcion.mascotas.entidades.Mascota;
import com.adopcion.mascotas.service.Mascotas.MascotasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mascotas")
public class MascotaController {

    @Autowired
    private MascotasService mascotasService;

    @PostMapping("crear")
    public Mascota crearMascota(@RequestBody() Mascota mascota)
    {
        return mascotasService.crearMascota(mascota);
    }


    @GetMapping("/disponibles")
    public List<Mascota> mascotasDisponibles()
    {
        return mascotasService.mascotasDisponibles();
    }

    @PutMapping("/actualizar/{id}")
    public Mascota actualizarMascota(@PathVariable("id") Long id,@RequestBody() MascotaDTO mascota)
    {
        return mascotasService.actualizarMascota(id, mascota);
    }

    @DeleteMapping("/borrar/{id}")
    public String borrarMascota(@PathVariable("id") Long id)
    {
        return mascotasService.borrarMascota(id);
    }
}
