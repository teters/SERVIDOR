package com.example.PrimerProyectoTIC1.CentrosDeportivos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/centrodeportivo")
public class CentroDeportivoController {
    @Autowired
    CentroDeportivoService centroDeportivoService;
    @PostMapping( "/agregarcentrodeportivo")
    public void guardarDatos(@RequestBody CentroDeportivo1 cd1){
        String nombre= cd1.getNombre();
        String direccion= cd1.getDireccion();
        centroDeportivoService.agregarCentroDeportivo(nombre,direccion);
    }

}
