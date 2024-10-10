package com.adopcion.mascotas.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "mascota")
@Entity
@Data
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "edad")
    private Integer  edad;

    @Column(name = "disponible")
    private boolean disponible;

    @Column(name = "id_tipo_mascota")
    private Long idTipoMascota;


    @ManyToOne
    @JoinColumn(name = "id_tipo_mascota", referencedColumnName = "id",insertable=false, updatable=false)
    private TipoMascota tipoMascota;


}
