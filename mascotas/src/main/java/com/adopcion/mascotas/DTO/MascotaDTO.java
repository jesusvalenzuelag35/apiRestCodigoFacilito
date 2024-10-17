package com.adopcion.mascotas.DTO;

import jakarta.persistence.Column;

public class MascotaDTO {

    private String nombre;

    private Integer  edad;

    private boolean disponible;

    private Long idTipoMascota;

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

    public Long getIdTipoMascota() {
        return idTipoMascota;
    }

    public void setIdTipoMascota(Long idTipoMascota) {
        this.idTipoMascota = idTipoMascota;
    }
}
