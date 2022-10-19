package com.example.PrimerProyectoTIC1.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado,Long> {
    List<Empleado> findByMail(String mail);
    int countByNombre(String nombre);
}
