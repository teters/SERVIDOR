package com.example.PrimerProyectoTIC1.User;

import com.example.PrimerProyectoTIC1.Empresas.Empresa1;

import javax.persistence.*;

@Entity
//@Table (name = "Managers")
public class BossEmpresa1 extends User1 {

    public BossEmpresa1() {}
    @OneToOne(cascade = CascadeType.ALL) //para que se persistan las instancias referenciadas
    @JoinColumn(name = "empresaID")
    private Empresa1 empresa;

}
