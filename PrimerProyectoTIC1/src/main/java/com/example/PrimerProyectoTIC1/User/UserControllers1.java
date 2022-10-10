package com.example.PrimerProyectoTIC1.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserControllers1 {
    @Autowired
    UserServices userService;
    @PostMapping("/user")
    public void guardarDatos(@RequestBody User1 persona1){
        Long id= persona1.getId();
        String nombre= persona1.getNombre();
        String direccion= persona1.getDireccion();
        Long telefono= persona1.getTelefono();
        userService.agregarCliente(id, nombre,direccion,telefono);
    }



}
