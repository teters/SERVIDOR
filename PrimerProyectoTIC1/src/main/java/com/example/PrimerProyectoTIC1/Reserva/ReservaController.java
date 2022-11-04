package com.example.PrimerProyectoTIC1.Reserva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/reservas"))
public class ReservaController {
    @Autowired
    ReservaService reservaService;
    @PostMapping("/")
    public void guardarReserva(@RequestBody Reserva reserva){
        reservaService.agregarReserva(reserva);
    }
}
