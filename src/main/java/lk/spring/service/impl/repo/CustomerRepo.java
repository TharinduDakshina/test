package lk.spring.service.impl.repo;

import lk.spring.service.impl.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,String> {

    Customer findTopByOrderByIdDesc();

}
