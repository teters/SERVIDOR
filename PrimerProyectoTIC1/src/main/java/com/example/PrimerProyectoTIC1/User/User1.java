package com.example.PrimerProyectoTIC1.User;

import javax.persistence.*;

@MappedSuperclass
public class User1 {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private Long telefono;
    @Column
    private String nombre;
    @Column
    private String mail;



    public User1(Long id, String nombre, Long telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = direccion;
    }


    public User1() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
