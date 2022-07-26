package lk.spring.service.impl.repo;


import lk.spring.service.impl.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepo extends JpaRepository<Driver,String> {

    Driver findTopByOrderByIdDesc();

}
