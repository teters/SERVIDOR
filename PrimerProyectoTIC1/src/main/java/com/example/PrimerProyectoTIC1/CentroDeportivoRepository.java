package com.example.PrimerProyectoTIC1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentroDeportivoRepository extends JpaRepository<CentroDeportivo, String>{
}
