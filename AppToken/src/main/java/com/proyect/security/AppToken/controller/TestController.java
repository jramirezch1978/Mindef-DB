package com.proyect.security.AppToken.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
    @GetMapping("/hello-1")
    @PreAuthorize("hasRole('administrador')")
    public String helloAdmin(){
        return "Hello Sprig Boot With Keycloak with ADMIN";
    }

    @GetMapping("/hello-2")
    @PreAuthorize("hasRole('contador') or hasRole('almacenero')")
    public String helloUser(){
        return "Hello Sprig Boot With Keycloak with USER";
    }
}
