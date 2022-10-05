package com.example.PrimerProyectoTIC1.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserControllers {
    @Autowired
    UserServices userService;
    @PostMapping("/user")
    public void guardarDatos(@RequestBody User1 persona1){
        String nombre= persona1.getNombre();
        String direccion= persona1.getDireccion();
        Long telefono= persona1.getTelefono();
        userService.agregarCliente(nombre,direccion,telefono);
    }


}
