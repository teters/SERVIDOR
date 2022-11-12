package com.example.PrimerProyectoTIC1.CheckIn;

import java.time.LocalDateTime;

public class CheckinDTO {
    private Long id_empleado;
    private Long id_actividad;
    private String hora;


    public Long getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(Long id_empleado) {
        this.id_empleado = id_empleado;
    }

    public Long getId_actividad() {
        return id_actividad;
    }

    public void setId_actividad(Long id_actividad) {
        this.id_actividad = id_actividad;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
