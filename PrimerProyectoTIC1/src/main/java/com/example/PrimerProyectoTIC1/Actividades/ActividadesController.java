package com.example.PrimerProyectoTIC1.Actividades;

import com.example.PrimerProyectoTIC1.Actividades.ActividadService;
import com.example.PrimerProyectoTIC1.CentrosDeportivos.CentroDeportivo1;
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
        String horario= actividad.getHorario();
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
    @GetMapping("/todas")
    public List<String> obtenerNombres(){
        return actividadService.obtenerListaDeActividadesPorNombre();
    }
    @GetMapping("/{nombre}/centros")
    @ResponseBody
    public List<String> obtenerNombreCentros(@PathVariable String nombre){
        return actividadService.obtenerCentrosDeUnaActividad(nombre);
    }
    @GetMapping("/{nombre}/horarios")
    @ResponseBody
    public List<String> obtenerHorarios(@PathVariable String nombre){
        return actividadService.obtenerHorariosDeUnaActividad( nombre);
    }
    @GetMapping("/{actividad}/{centro}/horarios")
    @ResponseBody
    public List<String> obtenerHorariosActividadCentro(@PathVariable String actividad,@PathVariable String centro){
        return actividadService.obtenerHorariosActividadCentro(actividad,centro);
    }
    @GetMapping("/{actividad}/{horario}/centro")
    @ResponseBody
    public List<String> obtenerCentrosAPartirDeHorarios(@PathVariable String actividad,@PathVariable String horario){
        return actividadService.obtenerCentrosAPartirDeHorario(horario,actividad);
    }




}

