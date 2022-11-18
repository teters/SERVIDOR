package com.example.PrimerProyectoTIC1.Imagenes;

import javax.persistence.*;

@Entity
@Table(name= "imagenes")
public class Imagen {

    @Id
    @GeneratedValue
    Long id;

    @Lob
    String content;

    @Column
    String nombreActividad;





    public Imagen() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return nombreActividad;
    }

    public void setName(String name) {
        this.nombreActividad = name;
    }
}