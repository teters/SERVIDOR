package com.example.PrimerProyectoTIC1.User;

import javax.persistence.*;

@MappedSuperclass
public class User1 {
    @Id
    private Long telefono;
    @Column
    private String nombre;
    @Column
    private String mail;



    public User1(String nombre, Long telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = direccion;
    }


    public User1() {

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
