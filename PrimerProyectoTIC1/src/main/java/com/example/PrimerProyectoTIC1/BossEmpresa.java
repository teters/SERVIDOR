package com.example.PrimerProyectoTIC1;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "usuarioEMpresa")
public class BossEmpresa extends User{
    private String nombre;
    private Long telefono;
    private String mail;

    public BossEmpresa(String teo, long l, String an_nicolas){
        ;
    }

    public BossEmpresa() {

    }
}
