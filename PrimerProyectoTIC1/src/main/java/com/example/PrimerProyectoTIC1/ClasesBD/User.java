package com.example.PrimerProyectoTIC1.ClasesBD;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@MappedSuperclass
public class User {
    @Id
    private Long telefono;
    @Column
    private String nombre;
    @Column
    private String mail;



    public User(String nombre, Long telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = direccion;
    }


    public User() {

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

    public String getDireccion() {
        return mail;
    }

    public void setDireccion(String direccion) {
        this.mail = direccion;
    }

    //@OneToMany(mappedBy = "telefono", cascade = CascadeType.ALL, orphanRemoval = true)
}
