package org.julietjorge.apieventosdeportivos.services;


import org.julietjorge.apieventosdeportivos.models.EventosModels;
import org.julietjorge.apieventosdeportivos.repository.IEventosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class EventoService {

    @Autowired //inyeccion de dependencias
    IEventosRepository eventosRepository;

    //listado
    public ArrayList<EventosModels> getAllEventos(){
        return (ArrayList<EventosModels>) eventosRepository.findAll();
    }

    //metodo para guardar/añadir
    public EventosModels addEvento(EventosModels eventos){
        return eventosRepository.save(eventos);
    }

    public Optional<EventosModels> getEventosById(long id){
        return eventosRepository.findById(id);
    }

    //actualizar/modificacion de eventos disponibles
    public EventosModels updateEvento(EventosModels request, long id){
        EventosModels evento = eventosRepository.findById(id).get();
        evento.setNombre(request.getNombre());
        evento.setDescripcion(request.getDescripcion());
        evento.setFecha(request.getFecha());
        evento.setHora(request.getHora());
        evento.setDuracion(request.getDuracion());
        return eventosRepository.save(evento);


    }

    //eliminacion de un evento

    public boolean deleteEvento(long id){
        try {
            eventosRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }




}
