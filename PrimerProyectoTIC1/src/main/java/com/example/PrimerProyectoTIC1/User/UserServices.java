package com.example.PrimerProyectoTIC1.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    UserRepository1 repository;
    public void agregarCliente(Long id, String nombre,String direccion,Long telefono){
        User1 persona1 =new User1(id, nombre,telefono,direccion);
        repository.save(persona1);

    }

    /*@Bean
    CommandLineRunner commandLineRunner(PersonaRepository repository){
        return args -> {
            Persona persona1 = new Persona(
                    "persona1",
                    "persona1@mail.com"
            );

            repository.saveAll(
                    List.of(persona1)
            );
        };
    };*/
}

