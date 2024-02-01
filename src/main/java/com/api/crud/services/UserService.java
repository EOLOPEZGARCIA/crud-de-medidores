package com.api.crud.services;

import com.api.crud.models.UserModel;
import com.api.crud.repositories.IUserRepository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

    @Autowired
    IUserRepository userRepository;

    public ArrayList<UserModel> getMedidores() {
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveMedidor(UserModel medidor) {

        return userRepository.save(medidor);
    }

    public Optional<UserModel> getById(Long id) {
        return userRepository.findById(id);
    }

    public UserModel updateById(UserModel request, Long id) {
        UserModel medidor = userRepository.findById(id).get();

        medidor.setNumeroMedidor(request.getNumeroMedidor());
        medidor.setNumeroServicio(request.getNumeroServicio());
        medidor.setDireccion(request.getDireccion());
        medidor.setNombreUsuario(request.getNombreUsuario());

        return medidor;

    }

    public Boolean deleteMedidor(Long id) {
        try {
            userRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

}