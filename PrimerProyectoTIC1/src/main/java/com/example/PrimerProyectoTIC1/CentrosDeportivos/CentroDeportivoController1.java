package com.example.PrimerProyectoTIC1.CentrosDeportivos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/centrodeportivo")
public class CentroDeportivoController1 {
    @Autowired
    CentroDeportivoService centroDeportivoService;
    @PostMapping( "/")
    public void guardarDatos(@RequestBody CentroDeportivo1 cd1){
        String nombre= cd1.getNombre();
        String direccion= cd1.getDireccion();
        centroDeportivoService.agregarCentroDeportivo(nombre,direccion);
    }
    @GetMapping("/")
    public List<CentroDeportivo1> listaDeCentrosDeportivos(){
        return centroDeportivoService.obtenerListaDeCentrosDeportivos();
    }


}
