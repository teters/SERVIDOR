package com.example.PrimerProyectoTIC1.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {
    @Autowired
    ManagerRepository repository;
    public void agregarManager(String nombre, Long tel, String mail){
        repository.save(new User1(nombre,tel,mail));
    }
    public List<User1> obtenerListaDeManagers(){
        return repository.findAll();
    }
}
