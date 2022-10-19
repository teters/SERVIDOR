package com.example.PrimerProyectoTIC1.Reservas;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ListResourceBundle;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, String> {
    //List<Reserva> findByNombre(String nombre);
}
