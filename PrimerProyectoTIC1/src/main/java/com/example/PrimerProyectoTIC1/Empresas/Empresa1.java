package com.example.PrimerProyectoTIC1.Empresas;


import com.example.PrimerProyectoTIC1.User.Empleado;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="empresas")
public class Empresa1 {
    @OneToMany
    @JoinColumn(name = "empresaID")
    private Set<Empleado> empleados;

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long empresaID;
   private Long telefono;
   @Column
   private String nombre;
   @Column
   private String direccion;

    public Empresa1(Long empresaID, Long telefono, String nombre,String direccion) {
        this.empresaID = empresaID;
        this.telefono = telefono;
        this.nombre = nombre;
        this.direccion=direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public Empresa1() {
    }

    public Long getEmpresaID() {
        return empresaID;
    }

    public void setEmpresaID(Long empresaID) {
        this.empresaID = empresaID;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
