package com.usergio.admincar.CarController;

import com.usergio.admincar.model.CarModel;
import com.usergio.admincar.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Car")
public class CarController {

    @Autowired CarService carService;

    @GetMapping("/all")
    public List<CarModel> obtener() {return carService.obtener();}
}
