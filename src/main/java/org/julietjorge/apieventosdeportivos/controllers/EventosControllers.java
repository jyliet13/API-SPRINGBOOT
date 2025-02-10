package org.julietjorge.apieventosdeportivos.controllers;


import org.julietjorge.apieventosdeportivos.models.EventosModels;
import org.julietjorge.apieventosdeportivos.services.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/eventosdeportivos")
public class EventosControllers {

    //peticiones y rutas

    @Autowired
    private EventoService eventoService;

    //listado
    @GetMapping
    public ArrayList<EventosModels> getAllEventos(){
        return this.eventoService.getAllEventos();
    }

    //añadir
    @PostMapping
    public EventosModels addEvento(@RequestBody EventosModels eventos){
        return this.eventoService.addEvento(eventos);
    }

    //listar por id
    @GetMapping(path = "/{id}")
    public Optional<EventosModels> getEventoById(@PathVariable long id){
        return this.eventoService.getEventosById(id);
    }

    //actualizar informacion de evento

    @PutMapping(path = "/{id}")
    public EventosModels updateEvento(@PathVariable long id, @RequestBody EventosModels request){
        return this.eventoService.updateEvento(request, id);
    }

    //eliminar usuario

    @DeleteMapping(path = "/{id}")
    public String deleteEvento(@PathVariable("id") long id){
        boolean xx = this.eventoService.deleteEvento(id);

        if(xx) {
            return "evento eliminado " + id;
        } else {
            return "ERROR AL ELIMINAR EVENTO";
        }
    }


}
