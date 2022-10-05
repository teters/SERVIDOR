package com.example.PrimerProyectoTIC1.ClasesBD;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "usuarioEMpresa")
public class BossEmpresa extends User {
    private String nombre;
    private Long telefono;
    private String mail;




    public BossEmpresa() {

    }
}
