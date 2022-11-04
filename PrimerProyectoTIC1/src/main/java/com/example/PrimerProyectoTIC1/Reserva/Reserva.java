package com.example.PrimerProyectoTIC1.Reserva;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="reservas")
public class Reserva {
    @Id
    @GeneratedValue
    Long id;

    @Column
    private Long empleadoId;

    @Column
    private Long centroId;

    @Column
    private LocalDate fecha;

    @Column
    private String hora;

    @Column
    private String dia;

//    @Column
//    private String fechaReserva;

    public Reserva() {}

    public Reserva(Long empleadoId, Long centroId, String fecha, String hora, String dia /*, String fechaReserva*/) {
        this.empleadoId = empleadoId;
        this.centroId = centroId;
        this.fecha = fecha;
        this.hora = hora;
        this.dia = dia;
        //this.fechaReserva = fechaReserva;
    }

    public Long getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(Long empleadoId) {
        this.empleadoId = empleadoId;
    }

    public Long getCentroId() {
        return centroId;
    }

    public void setCentroId(Long centroId) {
        this.centroId = centroId;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

//    public String getFechaReserva() {
//        return fechaReserva;
//    }
//
//    public void setFechaReserva(String fechaReserva) {
//        this.fechaReserva = fechaReserva;
//    }
}
