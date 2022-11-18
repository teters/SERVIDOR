package com.example.PrimerProyectoTIC1.User;

import com.example.PrimerProyectoTIC1.CentrosDeportivos.CentroDeportivo1;
import com.example.PrimerProyectoTIC1.CentrosDeportivos.CentroDeportivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("managercentrodep")
public class BossCDController {
    private CentroDeportivo1 centroDeportivo1;
    @Autowired
    CentroDeportivoService centroDeportivoService;
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
    @PostMapping("/")
    public void guardarManagercd(@RequestBody BossCentroDepDTO bossy){
        BossCD1 boss=new BossCD1();
        boss.setMail(bossy.getMail());
        boss.setNombre(bossy.getNombre());
        boss.setTelefono(bossy.getTelefono());
        boss.setPassword(bossy.getPassword());
        boss.setCentroDepor(centroDeportivoService.getCentroByNombre(bossy.getNombre()));
        bossCDService.agregarManager(boss);
    }

    @GetMapping("/centroDelManagerLoggeado")
    @ResponseBody
    public CentroDeportivo1 getBossCD(){
        return centroDeportivo1;
    }


}
