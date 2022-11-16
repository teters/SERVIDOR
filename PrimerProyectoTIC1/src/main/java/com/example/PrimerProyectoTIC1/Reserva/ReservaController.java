package com.example.PrimerProyectoTIC1.Reserva;

import com.example.PrimerProyectoTIC1.Actividades.ActividadService;
import com.example.PrimerProyectoTIC1.User.Empleado;
import com.example.PrimerProyectoTIC1.User.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reserva")
public class ReservaController {
    @Autowired
    ReservaService reservaService;
    @Autowired
    ActividadService actividadService;
    @Autowired
    EmpleadoService empleadoService;
    @PostMapping("/")
    public Boolean guardarReserva(@RequestBody ReservaDTO reservaDTO){
        Reserva reserva=new Reserva();
        reserva.setActividadId(reservaDTO.getActividadId());
        reserva.setCentroId(reservaDTO.getCentroId());
        reserva.setDia(actividadService.obtenerActividadPorId(reservaDTO.getActividadId()).getDia());
        reserva.setFecha(reservaDTO.getFecha());
        reserva.setHora(actividadService.obtenerActividadPorId(reservaDTO.getActividadId()).getHorario());
        Empleado empl=empleadoService.obtenerEmpleadoPorMailsolamente(reservaDTO.getMail_empleado());
        Long empl_id=empl.getId();
        reserva.setEmpleadoId(empl_id);

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
