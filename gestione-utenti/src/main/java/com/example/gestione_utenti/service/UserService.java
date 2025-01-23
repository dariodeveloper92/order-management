package com.example.gestione_utenti.service;

import com.example.gestione_utenti.model.Users;
import com.example.gestione_utenti.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    //costruttore
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    //save
    public Users saveUser(Users users){
        return userRepository.save(users);
    }

    //get by id
    public Users getUserById(Long id){
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    //update email
    public void updateUserEmail(Long id, String email){
        Users users = userRepository.findById(id).orElseThrow(() -> new RuntimeException("Users not found"));
        users.setEmail(email);
        userRepository.save(users);
    }
}
