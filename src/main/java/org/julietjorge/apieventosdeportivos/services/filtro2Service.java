package org.julietjorge.apieventosdeportivos.services;

import org.julietjorge.apieventosdeportivos.models.filtro2Models;
import org.julietjorge.apieventosdeportivos.repository.IFiltro2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class filtro2Service {

    @Autowired
    private IFiltro2Repository repository;

    public List<filtro2Models> obtenerDisponibles() {
        return repository.findAll();
    }

}
