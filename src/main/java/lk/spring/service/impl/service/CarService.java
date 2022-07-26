package lk.spring.service.impl.service;

import lk.spring.service.impl.dto.CarDTO;

import java.util.List;


public interface CarService {

    void saveCar(CarDTO dto);
    void updateCar(CarDTO dto);
    void deleteCar(String id);
    CarDTO searchCar(String id);
    List<CarDTO> getAllCars();

}
