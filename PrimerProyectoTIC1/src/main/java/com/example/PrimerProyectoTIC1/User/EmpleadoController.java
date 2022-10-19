package com.example.PrimerProyectoTIC1.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    EmpleadoService empleadoService;
    @PostMapping ("/iniciosesion")
    public Empleado login(@RequestBody UsuarioLogin empleado){
        String mail= empleado.getMail();
        String password=empleado.getPassword();

        return empleadoService.obtenerEmpleadoPorMail(mail,password);

    }
    @PostMapping("/")
    public void agregarEmpleado(@RequestBody Empleado empleado){
        String nombre=empleado.getNombre();
        String mail= empleado.getMail();
        String password=empleado.getPassword();
        Long tel= empleado.getTelefono();
        Long saldo=empleado.getSaldo();
        String fechaVenc=empleado.getFechaVenc();
        Long empresaId=empleado.getEmpresaID();
        empleadoService.crearEmpleado(nombre,tel,mail,fechaVenc,password,saldo,empresaId);
    }
    @GetMapping("/")
    public List<Empleado> obtenerListaDeEmpleados(){
        return empleadoService.getListaDeEmpleados();
    }
}
