package com.adopcion.mascotas.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

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

    @OneToMany(mappedBy = "usuario")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "usuario"})
    private List<Adopcion> adopciones;

}
