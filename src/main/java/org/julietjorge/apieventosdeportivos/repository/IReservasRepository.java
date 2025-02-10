package org.julietjorge.apieventosdeportivos.repository;

import org.julietjorge.apieventosdeportivos.models.ReservasModels;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IReservasRepository extends JpaRepository<ReservasModels, Long> {

    List<ReservasModels> id(int id);
}
