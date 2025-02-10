package org.julietjorge.apieventosdeportivos.services;


import org.julietjorge.apieventosdeportivos.models.ReservasModels;
import org.julietjorge.apieventosdeportivos.repository.IReservasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ReservaService {

    @Autowired // inyeccion de dependencias
    IReservasRepository repository;

    public ArrayList<ReservasModels> getReservas() {
        return (ArrayList<ReservasModels>) repository.findAll();
    }

    //crear reserva
    public ReservasModels AddReserva(ReservasModels reserva) {
        return repository.save(reserva);
    }

    public Optional<ReservasModels> getById(Long id) {
        return repository.findById(id);
    }

    //eliminacion

    public boolean deleteReserva(Long id) {
        try {
            repository.deleteById(id);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
}
