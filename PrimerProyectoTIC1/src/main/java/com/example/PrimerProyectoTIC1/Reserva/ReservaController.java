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
    public Boolean guardarReserva(@RequestBody Reserva reserva){
        if(reservaService.validarPorCupos(reserva)){
            reservaService.agregarReserva(reserva);
            return false;
        }
        return true;
    }
    @GetMapping("/{mail}/")
    @ResponseBody
    public List<Reserva> obtenerReservasConMail(@PathVariable String mail){
        return reservaService.getReservasMail(mail);
    }
}
