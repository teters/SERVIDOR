package com.example.PrimerProyectoTIC1.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.time.LocalDate;
import java.util.List;

@Service
public class EmpleadoService {
    @Autowired
    EmpleadoRepository repository;
    public void crearEmpleado(String nombre, Long tel, String mail, LocalDate fechaVen, String password, Long saldo){
        repository.save(new Empleado(nombre,tel,mail,fechaVen,password,saldo));
    }
    public List<Empleado> getListaDeEmpleados(){
        return repository.findAll();
    }

}
