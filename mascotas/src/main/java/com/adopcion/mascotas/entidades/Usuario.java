package com.adopcion.mascotas.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "usuario")
@Entity
@Data
public class Usuario {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "correo_electronico")
    private String correoElectronico;
    @Column(name = "telefono")
    private String telefono;
}
