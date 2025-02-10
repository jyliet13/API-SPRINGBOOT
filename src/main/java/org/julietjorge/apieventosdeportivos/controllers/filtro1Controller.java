package org.julietjorge.apieventosdeportivos.controllers;

import org.julietjorge.apieventosdeportivos.models.filtro1Models;
import org.julietjorge.apieventosdeportivos.services.filtro1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/filtro/eventos")
public class filtro1Controller {

    @Autowired
    private filtro1Service filtro1service;

    @GetMapping
    public List<filtro1Models> filtrarEventos(
            @RequestParam(required = false) LocalDate fecha,
            @RequestParam(required = false) String ubicacion,
            @RequestParam(required = false) String tipoinstalacion) {

        // Si solo se manda la fecha, filtra solo por fecha
        if (fecha != null && ubicacion == null && tipoinstalacion == null) {
            return filtro1service.getFiltro1fecha(fecha);
        }

        // Si se manda solo la ubicación
        if (fecha == null && ubicacion != null && tipoinstalacion == null) {
            return filtro1service.getByUbicacion(ubicacion);
        }

        // Si se manda solo el tipo de instalación
        if (fecha == null && ubicacion == null && tipoinstalacion != null) {
            return filtro1service.getByInstalacion(tipoinstalacion);
        }

        return filtro1service.filtrarEventos(fecha, ubicacion, tipoinstalacion);
    }

}
