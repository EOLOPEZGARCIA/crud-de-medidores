package com.api.crud.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.crud.models.UserModel;
import com.api.crud.services.UserService;
import java.util.*;

@RestController
@RequestMapping("/medidor")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ArrayList<UserModel> getMedidores() {
        return this.userService.getMedidores();
    }

    @PostMapping
    public UserModel saveMedidores(@RequestBody UserModel medidor) {
        return this.userService.saveMedidor(medidor);
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> getMedidorById(@PathVariable("id") Long id) {
        return this.userService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public UserModel updateMedidorById(@RequestBody UserModel request, @PathVariable("id") Long id) {

        return this.userService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteMedidorById(@PathVariable("id") Long id) {
        boolean edo = this.userService.deleteMedidor(id);

        if (edo) {
            return "Medidor con id " + id + "eliminado";
        } else {
            return "Error al eliminar el medidor con id " + id;
        }
    }

}
