package com.example.PrimerProyectoTIC1.User;

import com.example.PrimerProyectoTIC1.CentrosDeportivos.CentroDeportivo1;

import javax.persistence.*;

@Entity
@Table  (name = "boss_centro_deportivo")
public class BossCD1 extends User1 {

    public BossCD1() {}
    @OneToOne(cascade = CascadeType.ALL) //para que se persistan las instancias referenciadas
    @JoinColumn(name = "id_centrodep")
    private CentroDeportivo1 centroDepor;
}
