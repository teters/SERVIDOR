package com.example.PrimerProyectoTIC1.User;

import java.time.LocalDate;

public class Empleado extends User1{
    private LocalDate fechaVenc;
    private Long empresaID;

    public Empleado(Long id, String nombre, Long telefono, String mail, LocalDate fechaVenc, Long empresaID) {
        super(id, nombre, telefono, mail);
        this.fechaVenc = fechaVenc;
        this.empresaID = empresaID;
    }

    public LocalDate getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(LocalDate fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    public Long getEmpresaID() {
        return empresaID;
    }

    public void setEmpresaID(Long empresaID) {
        this.empresaID = empresaID;
    }
}
