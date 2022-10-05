package com.example.PrimerProyectoTIC1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name="centrodeportivo")
public class CentroDeportivoController {
    @Autowired
    CentroDeportivoService centroDeportivoService;
    @PostMapping(value= "centrodeportivo")
    public void guardarDatos(@RequestBody CentroDeportivo cd1){
        String nombre= cd1.getNombre();
        String direccion= cd1.getDireccion();
        centroDeportivoService.agregarCentroDeportivo(nombre,direccion);
    }
}
