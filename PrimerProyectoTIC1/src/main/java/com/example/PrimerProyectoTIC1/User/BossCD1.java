package com.example.PrimerProyectoTIC1.User;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table //(name = "Boss Centro Deportivo")
// esta tabla no deberia persistir en la BD
public class BossCD1 extends User1 {
    private String nombre;
    private String direccion;




    public BossCD1() {

    }
}
