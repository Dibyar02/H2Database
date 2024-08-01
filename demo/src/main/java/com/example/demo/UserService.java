package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

   public UserEntity addUser(UserEntity user){

    UserEntity user1=new UserEntity();
    user1=userRepository.save(user);

    return user;

   }

   public List<UserEntity> getAllUser(){

    List<UserEntity> allUsers=userRepository.findAll();
    return allUsers;
   }

}
