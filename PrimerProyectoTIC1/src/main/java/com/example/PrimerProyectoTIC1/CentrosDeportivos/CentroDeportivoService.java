package com.example.PrimerProyectoTIC1.CentrosDeportivos;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CentroDeportivoService {

    @Autowired
    CentroDeportivoRepository centroDeportivoRepository;
    public void agregarCentroDeportivo(String nombre,String direccion){
        CentroDeportivo1 cd1 =new CentroDeportivo1();
        cd1.setNombre(nombre);
        cd1.setDireccion(direccion);
        centroDeportivoRepository.save(cd1);
    }
    public List<CentroDeportivo1> obtenerListaDeCentrosDeportivos(){
        return centroDeportivoRepository.findAll();
    }
}