package com.example.student.college.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.college.model.Login;
import com.example.student.college.repository.LoginRepo;

import java.util.Optional;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "http://localhost:3000/")
public class LoginAPI {

    @Autowired
    public LoginRepo loginRepo;

    @GetMapping("/byId/{username}")
    public ResponseEntity<?> getUserById(@PathVariable Long username){
        try {
            Optional<Login> optional = loginRepo.findById(username);

            if(optional.isPresent()){
                return  new ResponseEntity<>(optional, HttpStatus.OK);
            }else{
                return new ResponseEntity<>("User not ",HttpStatus.NOT_FOUND);
            }

        }catch (Exception ex){
            return new ResponseEntity<>("Network Erro",HttpStatus.BAD_REQUEST);
        }
    }

}
