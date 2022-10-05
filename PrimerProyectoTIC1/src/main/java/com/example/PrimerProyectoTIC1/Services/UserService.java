package com.example.PrimerProyectoTIC1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository repository;
    public void agregarCliente(String nombre,String direccion,Long telefono){
        User persona1 =new User(nombre,telefono,direccion);
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

