package com.example.PrimerProyectoTIC1.Empresas;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    @Autowired
    EmpresasRepository empresasRepository;

    public void agregarEmpresa(String nombre, Long telefono){
        Empresa1 empresa1 = new Empresa1(telefono,nombre);
        empresasRepository.save(empresa1);

    }
}
