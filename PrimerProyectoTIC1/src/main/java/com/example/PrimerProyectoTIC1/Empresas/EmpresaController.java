package com.example.PrimerProyectoTIC1.Empresas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
    @Autowired
    EmpresaService empresaService;
    @PostMapping("/agregarEmpresa")
    public void guardarEmpresa(@RequestBody Empresa1 empresa1) {
        String nombre = empresa1.getNombre();
        Long telefono = empresa1.getTelefono();
        empresaService.agregarEmpresa(nombre, telefono);
    }

}

