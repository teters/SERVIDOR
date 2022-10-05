package com.example.PrimerProyectoTIC1.User;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "usuarioEMpresa")
public class BossEmpresa1 extends User1 {
    private String nombre;
    private Long telefono;
    private String mail;




    public BossEmpresa1() {

    }
}
