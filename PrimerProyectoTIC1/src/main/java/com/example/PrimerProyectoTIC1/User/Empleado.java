package com.example.PrimerProyectoTIC1.User;

import com.example.PrimerProyectoTIC1.Empresas.Empresa1;

import javax.persistence.*;
import java.time.LocalDate;



@Entity
@Table(name = "empleados")

public class Empleado extends User1{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private Long saldo;





    //@ManyToOne(cascade = CascadeType.ALL) //para que se persistan las instancias referenciadas
    //@JoinColumn(name = "empresaID")
    //private Empresa1 empresa;

    public Long getSaldo() {
        return saldo;
    }

    public void setSaldo(Long saldo) {
        this.saldo = saldo;
    }

    public Empleado(String nombre, Long telefono, String mail, String fechaVenc, String password, Long saldo) {
        super( nombre, telefono, mail, password);
        this.fechaVenc = fechaVenc;
        this.saldo=saldo;
    }

    public Empleado() {
    }
    @Column
    private String fechaVenc;
    @Column
    private Long empresaID;

    public String getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(String fechaVenc) {
        this.fechaVenc = fechaVenc;
    }


}
