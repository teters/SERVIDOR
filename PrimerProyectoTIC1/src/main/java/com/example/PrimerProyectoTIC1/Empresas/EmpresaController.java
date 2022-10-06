package com.example.PrimerProyectoTIC1.Empresas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("listaDeEmpresas")
    public List<Empresa1> obtenerListaDeEmpresas(){
        return empresaService.empresasRepository.findAll();
    }

}

