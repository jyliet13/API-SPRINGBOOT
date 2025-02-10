package org.julietjorge.apieventosdeportivos.services;

import org.julietjorge.apieventosdeportivos.models.UserModel;
import org.julietjorge.apieventosdeportivos.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired //inyeccion de dependencias
    IUserRepository userRepository;


    public ArrayList<UserModel>  getUsers() {
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    //peticion de añadir/guardar
    public UserModel addUser(UserModel user) {
        return userRepository.save(user);
    }

    public Optional<UserModel> getById(Long id) {
        return userRepository.findById(id);
    }

    //modificacion usuarios
     public UserModel updateUser(UserModel request, long id ) {
        UserModel user = userRepository.findById(id).get();
        user.setNombre(request.getNombre());
        user.setCorreo(request.getCorreo());

        return userRepository.save(user);
     }

     //eliminacion de usuario

    public boolean deleteUser(long id) {
        try {
            userRepository.deleteById(id);
            return true;
        }catch (Exception e) {
            return false;
        }
    }


}
