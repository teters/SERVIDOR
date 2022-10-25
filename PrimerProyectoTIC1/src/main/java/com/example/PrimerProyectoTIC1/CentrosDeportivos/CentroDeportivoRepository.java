package com.example.PrimerProyectoTIC1.CentrosDeportivos;


import com.example.PrimerProyectoTIC1.Actividades.Actividad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CentroDeportivoRepository extends JpaRepository<CentroDeportivo1, String>{
    @Query("select c from CentroDeportivo1 c where c.nombre = ?1")
    CentroDeportivo1 findByNombre(String nombre);
}
