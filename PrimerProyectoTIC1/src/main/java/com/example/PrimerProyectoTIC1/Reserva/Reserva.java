package com.example.PrimerProyectoTIC1.Reserva;

import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="reservas")
public class Reserva {
    @Id
    @GeneratedValue
    Long id;

    private Long empleadoId;


    private Long centroId;

    @Column
    private LocalDate fechaReserva;

    @Column
    private String horaAct;

    @Column
    private String dia;

//    @Column
//    private String fechaReserva;

    public Reserva() {}

    public Reserva(Long empleadoId, Long centroId, LocalDate fecha, String hora, String dia /*, String fechaReserva*/) {
        this.empleadoId = empleadoId;
        this.centroId = centroId;
        this.fechaReserva = fecha;
        this.horaAct = hora;
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

    public LocalDate getFecha() {
        return fechaReserva;
    }

    public void setFecha(LocalDate fecha) {
        this.fechaReserva = fecha;
    }

    public String getHora() {
        return horaAct;
    }

    public void setHora(String hora) {
        this.horaAct = hora;
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
