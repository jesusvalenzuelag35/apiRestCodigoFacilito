package com.adopcion.mascotas.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.java.Log;

import java.util.Date;

@Table(name = "adopcion")
@Entity
@Data
public class Adopcion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "mascota_id")
    private Long mascotaId;

    @Column(name = "usuario_id")
    private Long usuarioId;

    @Column(name = "fecha_adopcion")
    private Date fechaAdopcion;


    @ManyToOne
    @JoinColumn(name = "mascota_id", referencedColumnName = "id",insertable=false, updatable=false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "adopciones"})
    private Mascota mascota;

    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id",insertable=false, updatable=false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "adopciones"})
    private Usuario usuario;


}
