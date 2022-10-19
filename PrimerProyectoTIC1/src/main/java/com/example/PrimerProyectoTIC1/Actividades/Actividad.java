package com.example.PrimerProyectoTIC1.Actividades;

import org.joda.time.DateTime;

import javax.persistence.*;

@Entity
@Table
public class Actividad {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long ActividadId;
    @Column
    private DateTime horario;
    @Column
    private Integer cupos;
    @Column
    private String nombre;
    @Column
    private Float precio;

    @Column
    private String imagen;


    public Actividad(Long id, DateTime horario, Integer cupos, String nombre, Float precio, String imagen) {
        this.ActividadId = id;
        this.horario = horario;
        this.cupos = cupos;
        this.nombre = nombre;
        this.precio = precio;
        this.imagen = imagen;
    }

    public Actividad() {}

    public Long getId() {
        return ActividadId;
    }

    public void setId(Long id) {
        this.ActividadId = id;
    }

    public DateTime getHorario() {
        return horario;
    }

    public void setHorario(DateTime horario) {
        this.horario = horario;
    }

    public Integer getCupos() {
        return cupos;
    }

    public void setCupos(Integer cupos) {
        this.cupos = cupos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
