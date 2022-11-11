package com.example.PrimerProyectoTIC1.CheckIn;


import com.example.PrimerProyectoTIC1.User.Empleado;
import com.example.PrimerProyectoTIC1.User.EmpleadoService;
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

    @Autowired
    EmpleadoService empleadoService;

    @PostMapping("/")
    public void hacerCheckIn(@RequestBody CheckIn checkIn){//validar si existe, descontar saldo
        Boolean estaVencido=checkInService.validarCarneDeSalud(checkIn.getEmpleado());
        String mail = checkIn.getEmpleado().getMail();
        Float precio = checkIn.getActividad().getPrecio();
        String contra = checkIn.getEmpleado().getPassword();
        if(! estaVencido){
            empleadoService.descontarSaldo(mail, contra, precio);
        }


        checkInService.agregarReserva(checkIn);
    }

}
