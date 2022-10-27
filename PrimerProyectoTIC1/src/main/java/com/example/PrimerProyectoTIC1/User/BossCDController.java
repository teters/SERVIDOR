package com.example.PrimerProyectoTIC1.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("managercentrodep")
public class BossCDController {
    @Autowired
    BossCDService bossCDService;
    @PostMapping("/iniciosesion")
    public BossCD1 login(@RequestBody UsuarioLogin user){
        String mail=user.getMail();
        String password= user.getPassword();
        return bossCDService.obtenerBossConMail(mail,password);
    }

}
