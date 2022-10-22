package com.example.PrimerProyectoTIC1.Imagenes;


import com.example.PrimerProyectoTIC1.Actividades.ActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImagenService {

    @Autowired
    ImagenRepository imagenRepository;

    public void agregarImagen(Long id, byte[] content, String name){
        Imagen imagen = new Imagen();
        imagen.setContent(content);
        imagen.setName(name);
        imagenRepository.save(imagen);
    }

}