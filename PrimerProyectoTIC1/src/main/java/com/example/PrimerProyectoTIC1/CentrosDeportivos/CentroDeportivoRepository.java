package com.example.PrimerProyectoTIC1.CentrosDeportivos;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentroDeportivoRepository extends JpaRepository<CentroDeportivo1, String>{
}
