package com.example.PrimerProyectoTIC1.Actividades;

import com.example.PrimerProyectoTIC1.Actividades.ActividadService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actividad")
public class ActividadesController {

    @Autowired
    ActividadService actividadService;

    @PostMapping("/actividad")
    public void guardarDatos(@RequestBody Actividad actividad){
        Long id= actividad.getId();
        DateTime horario= actividad.getHorario();
        Integer cupos = actividad.getCupos();
        String nombre= actividad.getNombre();
        Float precio = actividad.getPrecio();
        String imagen = actividad.getImagen();
        actividadService.agregarActividad(id, horario, cupos, nombre, precio, imagen);
    }
    @GetMapping("/")
    public List<Actividad> obtenerListaDeActividades(){
        return actividadService.obtenerListaDeActividades();
    }



}

