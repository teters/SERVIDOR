package com.example.PrimerProyectoTIC1.User;

import java.time.LocalDate;

public class Empleado extends User1{
    private LocalDate fechaVenc;

    public Empleado(Long id, String nombre, Long telefono, String mail, LocalDate fechaVenc) {
        super(id, nombre, telefono, mail);
        this.fechaVenc = fechaVenc;
    }

    public LocalDate getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(LocalDate fechaVenc) {
        this.fechaVenc = fechaVenc;
    }
}
