package com.example.PrimerProyectoTIC1.Imagenes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ImagenRepository extends JpaRepository<Imagen, Long> {
    @Query("select i.content from Imagen i where i.nombreActividad=?1")
    Optional<String> findContentByNombreActividad(String nombreActividad);
}
