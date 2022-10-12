package com.example.PrimerProyectoTIC1.User;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;



@Entity
@Table(name = "empleados")

public class Empleado extends User1{

    public Empleado(Long id, String nombre, Long telefono, String mail, LocalDate fechaVenc, Long empresaID) {
        super(id, nombre, telefono, mail);
        this.fechaVenc = fechaVenc;
        this.empresaID = empresaID;
    }

    public Empleado() {
    }
    private LocalDate fechaVenc;

    private Long empresaID;

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
