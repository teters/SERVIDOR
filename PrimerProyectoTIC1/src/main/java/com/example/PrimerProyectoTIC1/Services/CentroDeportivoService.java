package com.example.PrimerProyectoTIC1.Services;

import com.example.PrimerProyectoTIC1.ClasesBD.CentroDeportivo;
import com.example.PrimerProyectoTIC1.Repositories.CentroDeportivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CentroDeportivoService {

    @Autowired
    CentroDeportivoRepository repository;
    public void agregarCentroDeportivo(String nombre,String direccion){
        CentroDeportivo cd1 =new CentroDeportivo(nombre,direccion);
        repository.save(cd1);
    }
}