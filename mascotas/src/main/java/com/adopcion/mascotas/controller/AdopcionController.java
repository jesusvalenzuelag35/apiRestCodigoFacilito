package com.adopcion.mascotas.controller;

import com.adopcion.mascotas.entidades.Adopcion;
import com.adopcion.mascotas.service.AdopcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AdopcionController {

    @Autowired
    AdopcionService adopcionService;

    @GetMapping("hola")
    public String holaa(){
        return "HOla";
    }


    @PostMapping("adoptar")
    public Adopcion adoptarMascota(@RequestBody() Adopcion entidad){
        return adopcionService.crearAdopcion(entidad);
    }

}
