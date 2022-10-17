package com.example.PrimerProyectoTIC1.Actividades;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ListResourceBundle;

@Repository
public interface ActividadRepository extends JpaRepository<Actividad, String> {
    List<Actividad> findByNombre(String nombre);
}
