package com.example.PrimerProyectoTIC1.Reserva;

import javax.persistence.*;

@Entity
@Table(name="reservas")
public class Reserva {
    @Id
    @GeneratedValue
    Long id;

}
