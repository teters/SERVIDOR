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
    public void crearEmpleado(String nombre, Long tel, String mail, String fechaVen, String password, Long saldo){
        repository.save(new Empleado(nombre,tel,mail,fechaVen,password,saldo));
    }
    public List<Empleado> getListaDeEmpleados(){
        System.out.println(repository.findAll().size());
        return repository.findAll();
    }
    public Empleado obtenerEmpleadoPorMail(String nombre, Long tel, String mail, String fechaVen, String password, Long saldo){
        List<Empleado> empleados=repository.findByMail(mail);
        Empleado empleado=empleados.get(0);
        return empleado;

    }
        /*Empleado empleado=new Empleado(nombre,tel,mail,fechaVen,password,saldo);
        Boolean chequeo=false;
        repository.countByNombre(nombre);
        for (int i = 0; i < repository.findAll().size(); i++) {
            if (empleado.getMail() == repository.findAll().get(i).getMail() && empleado.getPassword() == repository.findAll().get(i).getPassword()) {
                chequeo = true;
            }
        }

        return chequeo;*/


}
