package com.example.PrimerProyectoTIC1.Imagenes;


import com.example.PrimerProyectoTIC1.Actividades.ActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImagenService {

    @Autowired
    ImagenRepository imagenRepository;

    public void agregarImagen(Imagen imagen){
        imagenRepository.save(imagen);
    }
    public String buscarImagenes(String nombreactividad){
        return imagenRepository.findContentByNombreActividad(nombreactividad).get();
    }

}