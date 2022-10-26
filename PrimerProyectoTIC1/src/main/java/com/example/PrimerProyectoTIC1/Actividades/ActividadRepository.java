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

    @Query("select a from Actividad a")
    List<Actividad> findAllActividades();

    @Query("select distinct a.centroDeportivo1 from Actividad a where a.nombre=?1")
    List<CentroDeportivo1> findCentroDeportivo(String nombre);

    @Query("select a.horario from Actividad a where a.nombre=?1")
    List<String> findHorarioByNombreDeActividad(String nombre);

    @Query("select a.horario from Actividad a where a.nombre=?1 and a.centroDeportivo1=?2")
    List<String> findHorarioByActividadCentro(String actividad,CentroDeportivo1 centro);

    @Query("select distinct a.imagen from Actividad a where a.nombre=?1")
    byte[] findImageByName(String nombre);

    @Query("select a from Actividad a where a.nombre=?1")
    List<Actividad> findActividadByNombre(String nombre);


}
