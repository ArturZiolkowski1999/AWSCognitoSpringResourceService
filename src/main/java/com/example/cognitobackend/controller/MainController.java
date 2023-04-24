package com.example.cognitobackend.controller;

import com.example.cognitobackend.dto.MessageDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MainController {

    @GetMapping("/hello")
    public ResponseEntity<MessageDTO> helloAdmin() {
        return ResponseEntity.ok(new MessageDTO("hola desde cognito"));
    }

//    @GetMapping("/hello-user")
//    @PreAuthorize("hasAuthority('ROLE_USER')")
//    public ResponseEntity<MessageDTO> helloUser() {
//        return ResponseEntity.ok(new MessageDTO("hola USER desde cognito"));
//    }
}