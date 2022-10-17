package com.example.PrimerProyectoTIC1.Actividades;


import com.example.PrimerProyectoTIC1.Actividades.Actividad;
import com.example.PrimerProyectoTIC1.Actividades.ActividadRepository;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActividadService {

    @Autowired
    ActividadRepository ActividadRepository;
    public void agregarActividad(Long id, DateTime horario, Integer cupos, String nombre, Float precio){
        Actividad actividad =new Actividad();
        actividad.setHorario(horario);
        actividad.setCupos(cupos);
        actividad.setNombre(nombre);
        actividad.setPrecio(precio);
        ActividadRepository.save(actividad);
    }
    public List<Actividad> obtenerListaDeActividades(){
        return ActividadRepository.findAll();
    }
}