package com.example.PrimerProyectoTIC1.CheckIn;


import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("checkIn")
public class CheckInController {

    @Autowired
    CheckInService checkInService;

    @PostMapping("/")
    public void hacerCheckIn(@RequestBody CheckIn checkIn){
        Boolean estaVencido=checkInService.validarCarneDeSalud(checkIn.getEmpleado());
        Boolean hayCuposDisponibles=checkInService.validarPorCupos(checkIn.getActividad());
        checkInService.agregarReserva(checkIn);
    }

}