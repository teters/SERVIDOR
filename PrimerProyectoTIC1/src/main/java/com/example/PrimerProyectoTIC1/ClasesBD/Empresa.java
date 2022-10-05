package com.example.PrimerProyectoTIC1.ClasesBD;


import javax.persistence.*;

@Entity
@Table
public class Empresa {
   @Id
   private Long telefono;
   @Column
   private String nombre;

    public Empresa(Long telefono, String nombre) {
        this.telefono = telefono;
        this.nombre = nombre;
    }

    public Empresa() {
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
