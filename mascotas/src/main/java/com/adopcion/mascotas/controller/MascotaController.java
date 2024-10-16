package com.adopcion.mascotas.controller;

import com.adopcion.mascotas.entidades.Mascota;
import com.adopcion.mascotas.service.Mascotas.MascotasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
