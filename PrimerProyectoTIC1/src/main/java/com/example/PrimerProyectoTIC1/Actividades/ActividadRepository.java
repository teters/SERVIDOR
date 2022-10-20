package com.example.PrimerProyectoTIC1.Actividades;


import com.example.PrimerProyectoTIC1.CentrosDeportivos.CentroDeportivo1;
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

    @Query("select distinct a.centroDeportivo1 from Actividad a where a.nombre=?1")
    List<CentroDeportivo1> findCentroDeportivo(String nombre);

    @Query("select a.horario from Actividad a where a.nombre=?1")
    List<String> findHorarioByNombreDeActividad(String nombre);





}
