package com.example.PrimerProyectoTIC1.User;


import javax.persistence.*;

@Entity
@Table (name = "Administradores")
public class Administrador extends User1 {

//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();

/*    public void crearBossEmpresa(String nombre, Long telefono, String mail){
        BossEmpresa1 bossEmpresa = new BossEmpresa1();
        bossEmpresa.setNombre(nombre);
        bossEmpresa.setTelefono(telefono);
        bossEmpresa.setMail(mail);
    }

    public void crearBossCD(String nombre, Long telefono, String mail){
        BossCD1 bossCD1 = new BossCD1();
        bossCD1.setNombre(nombre);
        bossCD1.setTelefono(telefono);
        bossCD1.setMail(mail);
    }*/
}
