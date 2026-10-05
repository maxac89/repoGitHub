
package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    
    @GetMapping("/")
    public String holaMundo() {
        return "Hola " + this.nombre + "!";
    }
    
    @Value("${nombre}")
    private String nombre;
    
    @GetMapping("/api")
    public String miApi() {
        return "Hola desde la API!";
    }
}
