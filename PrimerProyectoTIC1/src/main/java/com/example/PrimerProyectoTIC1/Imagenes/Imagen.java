package com.example.PrimerProyectoTIC1.Imagenes;

import javax.persistence.*;

@Entity
@Table(name= "imagenes")
public class Imagen {

    @Id
    @GeneratedValue
    Long id;

    @Lob
    byte[] content;

    @Column
    String nombreActividad;

    public Imagen(byte[] content, String name) {
        this.content = content;
        this.nombreActividad = name;
    }

    public Imagen(Long id, byte[] content, String name) {
        this.id = id;
        this.content = content;
        this.nombreActividad = name;
    }

    public Imagen() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getName() {
        return nombreActividad;
    }

    public void setName(String name) {
        this.nombreActividad = name;
    }
}