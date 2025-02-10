package org.julietjorge.apieventosdeportivos.repository;

import org.julietjorge.apieventosdeportivos.models.InstalacionesModels;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUlacionesRepository extends JpaRepository<InstalacionesModels, Long> {

    List<InstalacionesModels> id(int id);

}
