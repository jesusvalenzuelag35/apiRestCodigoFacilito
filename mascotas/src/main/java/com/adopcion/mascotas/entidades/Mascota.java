package com.adopcion.mascotas.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

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

    @OneToMany(mappedBy = "mascota")
    //@JsonIgnoreProperties({"hibernateLazyInitializer", "mascota"})
    @JsonIgnore
    private List<Adopcion> adopciones;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
