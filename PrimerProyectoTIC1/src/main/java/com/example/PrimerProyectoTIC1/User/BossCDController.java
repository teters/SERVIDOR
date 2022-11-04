package com.example.PrimerProyectoTIC1.User;

import com.example.PrimerProyectoTIC1.CentrosDeportivos.CentroDeportivo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("managercentrodep")
public class BossCDController {
    private CentroDeportivo1 centroDeportivo1;
    @Autowired
    BossCDService bossCDService;
    @PostMapping("/iniciosesion")
    public BossCD1 login(@RequestBody UsuarioLogin user){
        String mail=user.getMail();
        String password= user.getPassword();
        BossCD1 bossCD1=bossCDService.obtenerBossConMail(mail,password);
        centroDeportivo1=bossCD1.getCentroDepor();
        return bossCD1;
    }

    @GetMapping("/centroDelManagerLoggeado")
    @ResponseBody
    public CentroDeportivo1 getBossCD(){
        return centroDeportivo1;
    }


}
