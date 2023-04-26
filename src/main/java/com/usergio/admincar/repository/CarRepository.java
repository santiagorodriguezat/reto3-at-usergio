package com.usergio.admincar.repository;

import com.usergio.admincar.model.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarModel, Integer> {
}
