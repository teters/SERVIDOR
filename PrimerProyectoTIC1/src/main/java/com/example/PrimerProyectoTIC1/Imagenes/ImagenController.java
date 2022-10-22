package com.example.PrimerProyectoTIC1.Imagenes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/imagen")
public class ImagenController {

    @Autowired
    ImagenService imagenService;

    @PostMapping
    public void guardarDatos (@RequestBody Imagen imagen){
        Long id = imagen.getId();
        byte[] content = imagen.getContent();
        String name = imagen.getName();
        imagenService.agregarImagen(id, content, name);
    }

}
