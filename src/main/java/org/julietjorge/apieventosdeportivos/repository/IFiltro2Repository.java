package org.julietjorge.apieventosdeportivos.repository;

import org.julietjorge.apieventosdeportivos.models.filtro2Models;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFiltro2Repository  extends JpaRepository<filtro2Models, Long> {


    List<filtro2Models> findAll();

}
