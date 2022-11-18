package com.example.PrimerProyectoTIC1.Imagenes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/imagen")
public class ImagenController {

    @Autowired
    ImagenService imagenService;

    @PostMapping("/")
    public void guardarImagenes (@RequestBody Imagen imagen){
        imagenService.agregarImagen(imagen);
    }
    @GetMapping("/{nombre}")
    @ResponseBody
    public String getImagenes(@PathVariable String nombreActividad){
        return imagenService.buscarImagenes(nombreActividad);
    }

}
