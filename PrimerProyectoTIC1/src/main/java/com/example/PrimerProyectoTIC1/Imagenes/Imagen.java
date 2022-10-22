package com.example.PrimerProyectoTIC1.Imagenes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Imagen {

    @Id
    @GeneratedValue
    Long id;

    @Lob
    byte[] content;

    String name;

    public Imagen(Long id, byte[] content, String name) {
        this.id = id;
        this.content = content;
        this.name = name;
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
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}