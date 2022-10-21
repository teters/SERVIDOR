package com.example.PrimerProyectoTIC1.Actividades;


import com.example.PrimerProyectoTIC1.Actividades.Actividad;
import com.example.PrimerProyectoTIC1.Actividades.ActividadRepository;
import com.example.PrimerProyectoTIC1.CentrosDeportivos.CentroDeportivo1;
import com.example.PrimerProyectoTIC1.CentrosDeportivos.CentroDeportivoRepository;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActividadService {

    @Autowired
    ActividadRepository actividadRepository;
    @Autowired
    CentroDeportivoRepository centroDeportivoRepository;
    public void agregarActividad(Long id, String horario, Integer cupos, String nombre, Float precio, String imagen){
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
        List<CentroDeportivo1> centros = null;
        for (int i = 0; i < actividades.size(); i++) {
            centros.add(actividades.get(i).getCentroDeportivo1());
        }
        return centros;
    }
    public List<String> obtenerListaDeActividadesPorNombre(){
        List<String> actividads=null;
        actividads=actividadRepository.findByNombreDistinct();
        if(actividads.isEmpty()){
            actividads.add("NO HAY ACTIVIDADES");
        }
        return actividads;
    }
    public List<String> obtenerCentrosDeUnaActividad(String nombre){
        List<CentroDeportivo1> centros=actividadRepository.findCentroDeportivo(nombre);
        List<String> nombreCentros=new ArrayList<>();
        for (int i = 0; i < centros.size(); i++) {
            nombreCentros.add(centros.get(i).getNombre());
        }
        return nombreCentros;
    }
    public List<String> obtenerHorariosDeUnaActividad(String nombreDeAct){
        List<String> horarios=actividadRepository.findHorarioByNombreDeActividad(nombreDeAct);
        return horarios;
    }
    public List<String> obtenerHorariosActividadCentro(String nombreAct,String nombrecentro){
        CentroDeportivo1 centro= centroDeportivoRepository.findByNombre(nombrecentro);
        return actividadRepository.findHorarioByActividadCentro(nombreAct,centro);

    }
}