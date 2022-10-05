package com.example.PrimerProyectoTIC1.Controllers;

import com.example.PrimerProyectoTIC1.ClasesBD.User;
import com.example.PrimerProyectoTIC1.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name="user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping(value= "user")
    public void guardarDatos(@RequestBody User persona1){
        String nombre= persona1.getNombre();
        String direccion= persona1.getDireccion();
        Long telefono= persona1.getTelefono();
        userService.agregarCliente(nombre,direccion,telefono);
    }


}
