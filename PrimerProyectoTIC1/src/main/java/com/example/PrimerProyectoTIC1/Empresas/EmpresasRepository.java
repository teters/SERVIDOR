package com.example.PrimerProyectoTIC1.Empresas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresasRepository extends JpaRepository<Empresa1, Long>{}
