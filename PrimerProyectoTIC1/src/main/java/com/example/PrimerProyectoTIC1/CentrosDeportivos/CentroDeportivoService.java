package com.example.PrimerProyectoTIC1.CentrosDeportivos;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CentroDeportivoService {

    @Autowired
    CentroDeportivoRepository centroDeportivoRepository;
    public void agregarCentroDeportivo(String nombre,String direccion){
        CentroDeportivo1 cd1 =new CentroDeportivo1(nombre,direccion);
        centroDeportivoRepository.save(cd1);
    }
}