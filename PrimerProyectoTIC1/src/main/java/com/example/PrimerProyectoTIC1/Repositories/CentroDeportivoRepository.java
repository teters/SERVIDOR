package com.example.PrimerProyectoTIC1.Repositories;

import com.example.PrimerProyectoTIC1.ClasesBD.CentroDeportivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentroDeportivoRepository extends JpaRepository<CentroDeportivo, String>{
}
