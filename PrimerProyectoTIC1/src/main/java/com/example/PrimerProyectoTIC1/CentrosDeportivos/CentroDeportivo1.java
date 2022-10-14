package com.example.PrimerProyectoTIC1.CentrosDeportivos;

import com.example.PrimerProyectoTIC1.Actividades.Actividad;
import com.example.PrimerProyectoTIC1.User.Empleado;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="centrodeportivo")
public class CentroDeportivo1 {

    @OneToMany
    @JoinColumn(name = "IDCentroDeportivo")
    private Set<Actividad> SetActividades;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private String nombre;
    @Column(unique = true)
    private String direccion;

    public CentroDeportivo1() {
    }

    public CentroDeportivo1(Long id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
