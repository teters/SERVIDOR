package com.example.PrimerProyectoTIC1.Controllers;

import com.example.PrimerProyectoTIC1.ClasesBD.Empresa;
import com.example.PrimerProyectoTIC1.Services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name="empresa")
public class EmpresaController {
    @Autowired
    EmpresaService empresaService;
    @PostMapping(name="agregarEmpresa")
    public void guardarEmpresa(@RequestBody Empresa empresa) {
        String nombre = empresa.getNombre();
        Long telefono = empresa.getTelefono();
        empresaService.agregarEmpresa(nombre, telefono);
    }

}

