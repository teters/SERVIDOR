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
    public void crearEmpleado(String nombre, Long tel, String mail, String fechaVen, String password, Long saldo,Long empresaId){
        repository.save(new Empleado(nombre,tel,mail,fechaVen,password,saldo,empresaId));
    }
    public List<Empleado> getListaDeEmpleados(){
        System.out.println(repository.findAll().size());
        return repository.findAll();
    }
    public Empleado obtenerEmpleadoPorMail( String mail, String password){
        Empleado empleadoGenerico=new Empleado("error",10L,"contra","incorrecta",".",1L,1L);
        List<Empleado> empleados=repository.findAll();
        Empleado empleado=empleadoGenerico;
        for (int i = 0; i < empleados.size(); i++) {
            if(empleados.get(i).getMail().equals(mail)){
                empleado=empleados.get(i);
            }

        }
        if(empleado.getPassword().equals(password)){
            return empleado;
        }else {
            return empleadoGenerico;
        }

    }
    public Empleado obtenerEmpleadoPorMailsolamente( String mail){
        Empleado empleadoGenerico=new Empleado("error",10L,"contra","incorrecta",".",1L,1L);
        List<Empleado> empleados=repository.findAll();
        Empleado empleado=empleadoGenerico;
        for (int i = 0; i < empleados.size(); i++) {
            if(empleados.get(i).getMail().equals(mail)){
                empleado=empleados.get(i);
            }

        }
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
