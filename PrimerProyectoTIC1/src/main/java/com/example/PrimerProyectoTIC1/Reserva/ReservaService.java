package com.example.PrimerProyectoTIC1.Reserva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaService {
    @Autowired
    ReservaRepository reservaRepository;
    public void agregarReserva(Reserva reserva){
        reservaRepository.save(reserva);
    }
}
