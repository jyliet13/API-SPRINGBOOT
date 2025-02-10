package org.julietjorge.apieventosdeportivos.services;


import org.julietjorge.apieventosdeportivos.models.InstalacionesModels;
import org.julietjorge.apieventosdeportivos.repository.IUlacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class InstalacionesService {

    @Autowired// inyeccion
    IUlacionesRepository repository;

    //LISTADO
    public ArrayList<InstalacionesModels> getInstalaciones() {
        return (ArrayList<InstalacionesModels>) repository.findAll();
    }
    //crear
    public InstalacionesModels addInstalacion(InstalacionesModels instalacion) {
        return repository.save(instalacion);
    }

    public Optional<InstalacionesModels> getById(long id) {
        return repository.findById(id);
    }

    //eliminar

    public boolean deleteInstalacion(long id) {
        try {
            repository.deleteById(id);
            return true;
        }catch (Exception e) {
            return false;
        }
    }



}
