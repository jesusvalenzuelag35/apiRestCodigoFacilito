package com.adopcion.mascotas.controller;

import com.adopcion.mascotas.entidades.TipoMascota;
import com.adopcion.mascotas.service.TipoMascota.TipoMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tipo/mascota")
public class TipoMascotaController {

    @Autowired
    private TipoMascotaService tipoMascotaService;

    @PostMapping("crear")
    TipoMascota crearTipoMascota(@RequestBody() TipoMascota tipoMascota)
    {
        return tipoMascotaService.crearTipoMascota(tipoMascota);
    }

}
