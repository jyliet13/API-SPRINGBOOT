package org.julietjorge.apieventosdeportivos.repository;


import org.julietjorge.apieventosdeportivos.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository //para hacer consultas
public interface IUserRepository extends JpaRepository<UserModel, Long> {


    List<UserModel> id(int id);


}
