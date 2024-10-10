package com.adopcion.mascotas.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tipo_mascota")
@Data
public class TipoMascota {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

}
