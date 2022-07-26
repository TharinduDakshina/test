package lk.spring.service.impl.repo;

import lk.spring.service.impl.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car,String> {
}
