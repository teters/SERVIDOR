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

    @PostMapping("/")
    public void guardarDatos(@RequestBody Actividad actividad){
        Long id= actividad.getId();
        DateTime horario= actividad.getHorario();
        Integer cupos = actividad.getCupos();
        String nombre= actividad.getNombre();
        Float precio = actividad.getPrecio();
        actividadService.agregarActividad(id, horario, cupos, nombre, precio);
    }
    @GetMapping("/{nombre}/")
    public List<Actividad> obtenerActividadPorNombre(String nombre){
        return actividadService.obtenerListaDeActividadesPorNombre(nombre);
    }
    @GetMapping("/")
    public List<Actividad> obtenerActividades(){
        return actividadService.obtenerListaDeActividades();
    }



}

