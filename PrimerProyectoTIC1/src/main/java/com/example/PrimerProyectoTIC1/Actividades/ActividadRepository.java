package com.example.PrimerProyectoTIC1.Actividades;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ListResourceBundle;

@Repository
public interface ActividadRepository extends JpaRepository<Actividad, String> {
    @Query("select a from Actividad a where a.nombre = ?1")
    List<Actividad> findByNombre(String nombre);

    @Query("select distinct a.nombre from Actividad a")
    List<String> findByNombreDistinct();





}
