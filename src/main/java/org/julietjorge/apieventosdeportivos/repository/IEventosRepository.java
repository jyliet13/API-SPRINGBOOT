package org.julietjorge.apieventosdeportivos.repository;

import org.julietjorge.apieventosdeportivos.models.EventosModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface IEventosRepository extends JpaRepository<EventosModels, Long> {

    List<EventosModels> id(int id);



}
