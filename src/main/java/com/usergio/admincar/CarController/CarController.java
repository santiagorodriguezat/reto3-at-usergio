package com.usergio.admincar.CarController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CarController {
    @GetMapping("/car")
    public String obtenerCar(){
        return "Hola mundo";
    }
}
