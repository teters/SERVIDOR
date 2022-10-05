package com.example.PrimerProyectoTIC1;


import com.example.PrimerProyectoTIC1.User.BossEmpresa1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class UsuariosTests {
    @Test
    public void herenciaDeUsuario(){
        BossEmpresa1 bossEmpresa= new BossEmpresa1();
        assertEquals("teo",bossEmpresa.getNombre());

    }
}
