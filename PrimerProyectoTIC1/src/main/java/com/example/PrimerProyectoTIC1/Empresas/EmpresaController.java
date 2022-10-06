package com.example.PrimerProyectoTIC1.Empresas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {
    @Autowired
    EmpresaService empresaService;
    @PostMapping("/agregarEmpresa")
    public void guardarEmpresa(@RequestBody Empresa1 empresa1) {
        String nombre = empresa1.getNombre();
        Long telefono = empresa1.getTelefono();
        String direccion=empresa1.getDireccion();
        empresaService.agregarEmpresa(nombre, telefono,direccion);
    }
    @GetMapping("listaDeEmpresas")
    public List<Empresa1> listaDeEmpresas(){
        return empresaService.obtenerListaDeEmpresas();
    }

}

