package com.example.PrimerProyectoTIC1.Empresas;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    EmpresasRepository empresasRepository;

    public void agregarEmpresa(String nombre, Long telefono,String direccion){
        Empresa1 empresa1 = new Empresa1(telefono,nombre,direccion);
        empresasRepository.save(empresa1);

    }
    public List<Empresa1> obtenerListaDeEmpresas(){
        return empresasRepository.findAll();
    }
}
