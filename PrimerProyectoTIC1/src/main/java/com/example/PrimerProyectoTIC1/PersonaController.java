package com.example.PrimerProyectoTIC1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired
    PersonaService personaService;
    @PostMapping(value= "persona")
    public void guardarDatos(@RequestBody Persona1 persona1){
        String nombre= persona1.getNombre();
        String direccion= persona1.getDireccion();
        Long telefono= persona1.getTelefono();
        personaService.agregarCliente(nombre,direccion,telefono);
    }
    @PostMapping(value= "empresa")
    public void guardarEmpresa(){}

}
