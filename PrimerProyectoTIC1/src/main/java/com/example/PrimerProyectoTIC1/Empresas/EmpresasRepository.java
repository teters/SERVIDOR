package com.example.PrimerProyectoTIC1.Empresas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresasRepository extends JpaRepository<Empresa1, Long>{
    @Query ("select e from Empresa1 e where Empresa1.nombre = ?1")
    Empresa1 findByNombre (String nombre);
}
