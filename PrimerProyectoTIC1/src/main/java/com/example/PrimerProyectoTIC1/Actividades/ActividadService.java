package com.example.PrimerProyectoTIC1.Actividades;


import com.example.PrimerProyectoTIC1.Actividades.Actividad;
import com.example.PrimerProyectoTIC1.Actividades.ActividadRepository;
import com.example.PrimerProyectoTIC1.CentrosDeportivos.CentroDeportivo1;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActividadService {

    @Autowired
    ActividadRepository actividadRepository;
    public void agregarActividad(Long id, DateTime horario, Integer cupos, String nombre, Float precio, String imagen){
        Actividad actividad =new Actividad();
        actividad.setHorario(horario);
        actividad.setCupos(cupos);
        actividad.setNombre(nombre);
        actividad.setPrecio(precio);
        actividad.setImagen(imagen);
        actividadRepository.save(actividad);
    }
    public List<Actividad> obtenerListaDeActividades(){
        return actividadRepository.findAll();
    }
    public List<CentroDeportivo1> obtenerListaDeCentrosDeportivos(List<Actividad> actividades){
        List<CentroDeportivo1> centros=null;
        actividades
        return centros;
    }
    public List<Actividad> obtenerListaDeActividadesPorNombre(String nombre){
        List<Actividad> actividads=null;
        actividads=actividadRepository.findByNombre(nombre);


        return actividads;
    }
}