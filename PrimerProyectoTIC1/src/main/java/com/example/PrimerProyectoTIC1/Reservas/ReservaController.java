package com.example.PrimerProyectoTIC1.Reservas;


import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ReservaController {

    @Autowired
    ReservaService ReservaService;

    @PostMapping
    public void guardarDatos(@RequestBody Reserva reserva){
        Long id = reserva.getId();
        DateTime hora = reserva.getHora();
        ReservaService.agregarReserva(id, hora);
    }

}
