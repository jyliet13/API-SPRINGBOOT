package org.julietjorge.apieventosdeportivos.controllers;


import org.julietjorge.apieventosdeportivos.models.ReservasModels;
import org.julietjorge.apieventosdeportivos.services.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/reservas")
public class ReservaControllers {

    //peticiones y rutas

    @Autowired
    private ReservaService reservaService;



    //listado
    @GetMapping
    public ArrayList<ReservasModels> getReservas() {
        return this.reservaService.getReservas();
    }

    //añadir
    @PostMapping
    public ReservasModels getReserva(@RequestBody ReservasModels reserva) {
        return this.reservaService.AddReserva(reserva);
    }

    //listar por id

    @GetMapping(path = "/{id}")
    public Optional<ReservasModels> getById(@PathVariable long id) {
        return this.reservaService.getById(id);
    }

    //eliminar

    @DeleteMapping(path = "/{id}")
    public String delete(@PathVariable("id") long id) {
        boolean xu = this.reservaService.deleteReserva(id);
        if (xu) {
            return "Reserva deletado com sucesso!";


        }else{
            return "ERROR AL ELIMINAR RESERVA";
        }
    }

}
