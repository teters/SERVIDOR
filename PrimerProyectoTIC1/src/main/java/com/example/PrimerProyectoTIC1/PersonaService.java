package com.example.PrimerProyectoTIC1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService  {

    @Autowired
    PersonaRepository repository;
    public void agregarCliente(String nombre,String direccion,Long telefono){
        Persona1 persona1 =new Persona1(nombre,telefono,direccion);
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

