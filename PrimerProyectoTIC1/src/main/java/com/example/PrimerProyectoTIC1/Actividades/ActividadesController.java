package com.example.PrimerProyectoTIC1.Actividades;

import com.example.PrimerProyectoTIC1.Actividades.ActividadService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ActividadesController {

    ActividadService actividadService;
    @Autowired
    @PostMapping("/user")
    public void guardarDatos(@RequestBody Actividad actividad){
        Long id= actividad.getId();
        DateTime horario= actividad.getHorario();
        Integer cupos = actividad.getCupos();
        String nombre= actividad.getNombre();
        Float precio = actividad.getPrecio();
        actividadService.agregarActividad(id, horario, cupos, nombre, precio);
    }



}

