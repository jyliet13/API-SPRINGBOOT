package org.julietjorge.apieventosdeportivos.controllers;

import org.julietjorge.apieventosdeportivos.models.filtro2Models;
import org.julietjorge.apieventosdeportivos.services.filtro2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/instalaciones")
public class filtro2Controllers {

    @Autowired
    private filtro2Service filtro2Service;

    @GetMapping("/disponibles")
    public List<filtro2Models> obtenerDisponibles() {
        return filtro2Service.obtenerDisponibles();
    }

}
