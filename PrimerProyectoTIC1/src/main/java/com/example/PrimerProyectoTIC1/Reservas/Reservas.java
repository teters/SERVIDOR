package com.example.PrimerProyectoTIC1.Reservas;

import javax.persistence.*;

@Entity
@Table(name="reservas")
public class Reservas {
    @Id
    @GeneratedValue
    Long id;

}
