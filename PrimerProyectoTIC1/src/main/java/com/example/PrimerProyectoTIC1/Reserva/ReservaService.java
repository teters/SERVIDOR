package com.example.PrimerProyectoTIC1.Reserva;

import com.example.PrimerProyectoTIC1.Actividades.Actividad;
import com.example.PrimerProyectoTIC1.User.Empleado;
import com.example.PrimerProyectoTIC1.User.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {
    @Autowired
    EmpleadoService empleadoServiceEnReservaService;
    @Autowired
    ReservaRepository reservaRepository;
    public void agregarReserva(Reserva reserva){
        reservaRepository.save(reserva);
    }
    public List<Reserva> getReservasMail(String mail){
        Empleado empleado=empleadoServiceEnReservaService.obtenerEmpleadoPorMailsolamente(mail);
        Long id=empleado.getId();
        return reservaRepository.findAllByEmpleadoId(id);
    }
    public Boolean validarPorCupos(Actividad actividad){

    }
}
