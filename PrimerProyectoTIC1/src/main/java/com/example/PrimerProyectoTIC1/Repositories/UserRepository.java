package com.example.PrimerProyectoTIC1.Repositories;

import com.example.PrimerProyectoTIC1.ClasesBD.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
