package org.julietjorge.apieventosdeportivos.controllers;


import org.julietjorge.apieventosdeportivos.models.InstalacionesModels;
import org.julietjorge.apieventosdeportivos.services.InstalacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/instalaciones")
public class InstalacionControllers {

    //peticiones y rutas


    @Autowired
    private InstalacionesService instalacionesService;


    //listado
    @GetMapping
    public ArrayList<InstalacionesModels> getInstalaciones() {
        return this.instalacionesService.getInstalaciones();
    }

    //añadir

    @PostMapping
    public InstalacionesModels addInstalacion(@RequestBody InstalacionesModels instalaciones) {
        return this.instalacionesService.addInstalacion(instalaciones);
    }

    @GetMapping(path = "/{id}")
    public Optional<InstalacionesModels> getById(@PathVariable long id) {
        return this.instalacionesService.getById(id);
    }

    //eliminar

    @DeleteMapping(path = "/{id}")
    public String deleteInstalacion(@PathVariable("id") long id) {
        boolean zz =  this.instalacionesService.deleteInstalacion(id);
        if (zz) {
            return "Instalacion eliminada";
        }else {
            return "Error al eliminar el instalacion";
        }
    }

}
