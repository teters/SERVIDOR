package com.example.PrimerProyectoTIC1.Reservas;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class ReservaService {


    @Autowired
    ReservaRepository ReservaRepository;

    public void agregarReserva(Long id, DateTime hora){
        Reserva reserva = new Reserva();
        reserva.setHora(hora);
        ReservaRepository.save(reserva);
    }

    public List<Reserva> obtenerListaDeReserva(){
        return ReservaRepository.findAll();

    }}
