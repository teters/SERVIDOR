package com.example.PrimerProyectoTIC1.Imagenes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ImagenRepository extends JpaRepository<Imagen, String> {
    @Query("select i.content from Imagen i where i.nombreActividad=?1")
    public List<byte[]> findContentByNombreActividad(String nombreActividad);
}
