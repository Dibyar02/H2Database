package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<UserEntity> addUser(@RequestBody UserEntity userOne) {
        //TODO: process POST request
      //  UserEntity entity=new UserEntity(UUID.randomUUID().toString(),"dibya","24");
        UserEntity userEntity=userService.addUser(userOne);
        
        return new ResponseEntity<>(userOne,HttpStatus.CREATED);
    }


    @GetMapping("/getAll")
    public ResponseEntity<List<UserEntity>> getAllUsers() {

        List<UserEntity> userEntities=userService.getAllUser();
        return new ResponseEntity<>(userEntities,HttpStatus.OK);
    }
    
    @GetMapping("/test")
    public String getTest() {
        return "testing working";
    }
    

}
