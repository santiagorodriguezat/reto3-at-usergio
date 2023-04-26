package com.usergio.admincar.service;

import com.usergio.admincar.model.CarModel;
import com.usergio.admincar.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

    public List<CarModel> obtener(){
        return carRepository.findAll();
    }

    public void crear(CarModel car){
        if(!carRepository.existById(car.getId())){
            carRepository.save(car);
        }
    }
}
