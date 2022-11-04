package com.example.PrimerProyectoTIC1.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Access;

@Service
public class BossCDService {
    @Autowired
    BossCDRepository bossCDRepository;
    public BossCD1 obtenerBossConMail(String mail, String password){
        BossCD1 boss=bossCDRepository.findByMail(mail);
        if(boss.getPassword().equals(password)){
            return boss;
        }else {
            return null;
        }

    }
}
