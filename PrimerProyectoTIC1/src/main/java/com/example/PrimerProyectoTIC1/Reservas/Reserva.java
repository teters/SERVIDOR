package com.example.PrimerProyectoTIC1.Reservas;

import com.example.PrimerProyectoTIC1.Actividades.Actividad;
import com.example.PrimerProyectoTIC1.User.Empleado;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table

public class Reserva {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "EmpleadoId")
    private Empleado empleado;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ActividadId")
    private Actividad actividad;

    @Id
    @GeneratedValue
    private Long id;
//    @Column
//    private LocalDate fecha;
    @Column
    private DateTime hora;

    public Reserva(Long id, DateTime hora) {
        this.id = id;
        this.hora = hora;
    }

    public Reserva() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DateTime getHora() {
        return hora;
    }

    public void setHora(DateTime hora) {
        this.hora = hora;
    }
}
