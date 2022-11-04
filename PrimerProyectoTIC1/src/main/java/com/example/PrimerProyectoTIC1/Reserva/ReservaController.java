package com.example.PrimerProyectoTIC1.Reserva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(("/reservas"))
public class ReservaController {
    @Autowired
    ReservaService reservaService;
    @PostMapping("/")
    public void guardarReserva(@RequestBody Reserva reserva){

        reservaService.agregarReserva(reserva);
    }
    @GetMapping("/{mail}/")
    @ResponseBody
    public List<Reserva> obtenerReservasConMail(@PathVariable String mail){
        return reservaService.getReservasMail(mail);
    }
}
