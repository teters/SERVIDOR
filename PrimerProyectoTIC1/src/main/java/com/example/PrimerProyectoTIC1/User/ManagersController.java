package com.example.PrimerProyectoTIC1.User;

import com.example.PrimerProyectoTIC1.Empresas.Empresa1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/manager")
public class ManagersController {
    @Autowired
    ManagerService managerService;
    @PostMapping("/agregarManager")
    public void guardarEmpresa(@RequestBody User1 user) {
        String nombre = user.getNombre();
        Long telefono = user.getTelefono();
        String direccion=user.getMail();
        //emService.agregarEmpresa(nombre, telefono,direccion);
    }
    @GetMapping("listaDeManagers")
    public List<User1> listaDeEmpresas(){
        return managerService.obtenerListaDeManagers();
    }

}
