package com.example.PrimerProyectoTIC1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class UsuariosTests {
    @Test
    public void herenciaDeUsuario(){
        BossEmpresa bossEmpresa= new BossEmpresa();
        assertEquals("teo",bossEmpresa.getNombre());

    }
}
