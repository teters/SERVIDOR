package com.example.PrimerProyectoTIC1.CentrosDeportivos;

import com.example.PrimerProyectoTIC1.Actividades.Actividad;
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
    @GetMapping("/{centro}/actividades")
    @ResponseBody
    public List<Actividad> obtenerActividadesDeUnCentro(@PathVariable CentroDeportivo1 centro){
        return centroDeportivoService.getActivities(centro);
    }
    @GetMapping("/{centroid}/")
    @ResponseBody
    public CentroDeportivo1 obtenerCentroById(@PathVariable Long centroid){
        return centroDeportivoService.getCentroById(centroid);
    }


}
