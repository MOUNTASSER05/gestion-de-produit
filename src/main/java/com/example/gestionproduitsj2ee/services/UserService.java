package com.example.gestionproduitsj2ee.services;


import com.example.gestionproduitsj2ee.entities.User;
import com.example.gestionproduitsj2ee.repositories.UserRepository;
import org.springframework.stereotype.Service;
@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User getUserByEmail(String email){
        User user = userRepository.findUserByEmail(email);
        return user;
    }

    public User createUser(User user){
        User newUser = userRepository.save(user);
        userRepository.flush();
        return newUser;
    }

}


