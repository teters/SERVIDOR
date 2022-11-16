package com.example.PrimerProyectoTIC1.User;

import com.example.PrimerProyectoTIC1.CentrosDeportivos.CentroDeportivo1;
import com.example.PrimerProyectoTIC1.Empresas.Empresa1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("managerempresa")
public class BossEmpresaController {
    private Empresa1 empresa;
    @Autowired
    BossEmpresaService bossEmpresaService;

    @PostMapping("/")
    public void guardarBossEmpresa(@RequestBody BossEmpresa1 boss){
        bossEmpresaService.agregaBossEmpresa(boss);
    }




}
