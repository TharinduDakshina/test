package lk.spring.service.impl.service;

import lk.spring.service.impl.dto.DriverDTO;

import java.util.List;

public interface DriverService {
    void saveDriver(DriverDTO dto);
    void updateDriver(DriverDTO dto);
    void deleteDriver(String id);
    DriverDTO searchDriver(String id);
    List<DriverDTO> getAllDrivers();
    DriverDTO findLastDriverById();


}
