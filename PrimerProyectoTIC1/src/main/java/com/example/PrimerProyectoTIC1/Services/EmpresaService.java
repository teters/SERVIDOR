package com.example.PrimerProyectoTIC1.Services;

import com.example.PrimerProyectoTIC1.ClasesBD.Empresa;
import com.example.PrimerProyectoTIC1.Repositories.EmpresasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {
    @Autowired
    EmpresasRepository empresasRepository;
    public void agregarEmpresa(String nombre, Long telefono){
        Empresa empresa= new Empresa(telefono,nombre);
        empresasRepository.save(empresa);

    }
}
