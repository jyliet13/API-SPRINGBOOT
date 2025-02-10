package org.julietjorge.apieventosdeportivos.repository;

import org.julietjorge.apieventosdeportivos.models.filtro1Models;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface IFiltro1Repository extends JpaRepository<filtro1Models, Long> {

    List<filtro1Models> findByFecha(LocalDate fecha);

    List<filtro1Models> findByUbicacion(String ubicacion);

    List<filtro1Models>  findByTipoinstalacion(String tipoinstalacion);

    List<filtro1Models> findByFechaAndUbicacionAndTipoinstalacion(LocalDate fecha, String ubicacion, String tipoinstalacion);
}
