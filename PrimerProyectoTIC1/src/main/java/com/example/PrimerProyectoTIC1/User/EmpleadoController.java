package com.example.PrimerProyectoTIC1.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController("empleado")
public class EmpleadoController {
    @Autowired
    EmpleadoService empleadoService;
    @PostMapping("/")
    public void agregarEmpleado(@RequestBody Empleado empleado){
        String nombre=empleado.getNombre();
        String mail= empleado.getMail();
        String password=empleado.getPassword();
        Long tel= empleado.getTelefono();
        Long saldo=empleado.getSaldo();
        LocalDate fechaVenc=empleado.getFechaVenc();
        empleadoService.crearEmpleado(nombre,tel,mail,fechaVenc,password,saldo);
    }
    @GetMapping("/")
    public List<Empleado> obtenerListaDeEmpleados(){
        return empleadoService.getListaDeEmpleados();
    }
}
