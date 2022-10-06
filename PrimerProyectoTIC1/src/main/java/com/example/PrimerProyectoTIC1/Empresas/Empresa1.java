package com.example.PrimerProyectoTIC1.Empresas;


import javax.persistence.*;

@Entity
@Table(name="empresas")
public class Empresa1 {
   @Id
   private Long telefono;
   @Column
   private String nombre;
   @Column
   private String direccion;

    public Empresa1(Long telefono, String nombre,String direccion) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.direccion=direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public Empresa1() {
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
