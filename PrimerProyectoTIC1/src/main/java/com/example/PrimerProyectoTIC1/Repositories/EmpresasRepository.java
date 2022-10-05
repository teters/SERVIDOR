package com.example.PrimerProyectoTIC1.Repositories;

import com.example.PrimerProyectoTIC1.ClasesBD.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresasRepository extends JpaRepository<Empresa, Long>{}
