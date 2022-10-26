package com.example.PrimerProyectoTIC1.Actividades;

import com.example.PrimerProyectoTIC1.CentrosDeportivos.CentroDeportivo1;
import com.example.PrimerProyectoTIC1.Imagenes.Imagen;
import jdk.dynalink.linker.LinkerServices;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Actividad {

    @OneToMany
    @JoinColumn(name = "actividadId")
    List<Imagen> Imagenes;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long ActividadId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "centro_deportivo_1_id", nullable = false)
    private CentroDeportivo1 centroDeportivo1;

    @Column
    private String horario;
    @Column
    private Integer cupos;
    @Column
    private String nombre;
    @Column
    private Float precio;

    @Column
    @Lob
    private String imagen;
    @Column
    private Boolean reserva;
    @Column
    private String tipoActividad;
    public CentroDeportivo1 getCentroDeportivo1() {
        return centroDeportivo1;
    }

    public Actividad(CentroDeportivo1 centroDeportivo1, String horario, Integer cupos, String nombre, Float precio, Boolean reserva, String tipoActividad) {
        this.centroDeportivo1 = centroDeportivo1;
        this.horario = horario;
        this.cupos = cupos;
        this.nombre = nombre;
        this.precio = precio;
        this.reserva = reserva;
        this.tipoActividad = tipoActividad;
    }

    public void setCentroDeportivo1(CentroDeportivo1 centroDeportivo1) {
        this.centroDeportivo1 = centroDeportivo1;
    }


    public Actividad(Long id, String horario, Integer cupos, String nombre, Float precio, String imagen) {
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

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
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
