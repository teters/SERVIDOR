package com.example.PrimerProyectoTIC1.ClasesBD;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class CentroDeportivo {
    @Id
    private String nombre;
    private String direccion;

    public CentroDeportivo() {
    }

    public CentroDeportivo(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
