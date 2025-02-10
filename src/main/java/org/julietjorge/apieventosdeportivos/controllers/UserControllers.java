package org.julietjorge.apieventosdeportivos.controllers;

import org.julietjorge.apieventosdeportivos.models.UserModel;
import org.julietjorge.apieventosdeportivos.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UserControllers {
    //peticiones y rutas
    @Autowired
    private UserServices userServices;



    @GetMapping
    public ArrayList<UserModel> getUsers() {
        return this.userServices.getUsers();
    }

    @PostMapping
    public UserModel addUser(@RequestBody UserModel user) {
        return this.userServices.addUser(user);
    }


    //listar usuarios por id
    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserById(@PathVariable long id) {
        return this.userServices.getById(id);

    }

    //actualizar informacion usuario
    @PutMapping(path = "/{id}")
    public UserModel updateUser(@RequestBody UserModel request, @PathVariable long id) {
           return this.userServices.updateUser(request, id);
    }

    //eliminar usuario
    @DeleteMapping(path = "/{id}")
    public String deleteUser(@PathVariable("id") long id) {
        boolean ok = this.userServices.deleteUser(id);

        if(ok) {
            return "User with id" + id + "deleted";
        } else {
            return "ERROR AL ELIMINAR USER " + id + "NOT DELETED";
        }
    }


}
