package com.example.PrimerProyectoTIC1.User;

import com.example.PrimerProyectoTIC1.User.User1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository1 extends JpaRepository<User1, Long> {

}
