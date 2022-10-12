package com.example.PrimerProyectoTIC1.CentrosDeportivos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="centrodeportivo")
public class CentroDeportivo1 {
    @Id
    private String nombre;
    private String direccion;

    public CentroDeportivo1() {
    }

    public CentroDeportivo1(String nombre, String direccion) {
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
