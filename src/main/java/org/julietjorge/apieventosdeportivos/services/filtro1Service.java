package org.julietjorge.apieventosdeportivos.services;

import org.julietjorge.apieventosdeportivos.models.filtro1Models;
import org.julietjorge.apieventosdeportivos.repository.IFiltro1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class filtro1Service {
    @Autowired
    private IFiltro1Repository filtro1Repository;


    //filtro por fecha
    public ArrayList<filtro1Models> getFiltro1fecha(LocalDate fecha ) {
        return (ArrayList<filtro1Models>) filtro1Repository.findByFecha(fecha);
    }

    //filtro por ubicacion
    public List<filtro1Models> getByUbicacion(String ubicacion) {
        return filtro1Repository.findByUbicacion(ubicacion);
    }

    //filtro por tipo de "deporte"
    public List<filtro1Models> getByInstalacion(String instalacion) {
        return filtro1Repository.findByTipoinstalacion(instalacion);
    }

    public List<filtro1Models> filtrarEventos(LocalDate fecha, String ubicacion, String tipo) {
        return filtro1Repository.findByFechaAndUbicacionAndTipoinstalacion(fecha, ubicacion, tipo);
    }
}

