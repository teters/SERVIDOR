package com.example.PrimerProyectoTIC1.User;

import javax.persistence.*;
import java.time.LocalDate;



@Entity
@Table(name = "empleados")

public class Empleado extends User1{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long EmpleadoId;

    public Empleado( String nombre, Long telefono, String mail, LocalDate fechaVenc, Long empresaID) {
        super( nombre, telefono, mail);
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
