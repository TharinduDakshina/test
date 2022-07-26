package lk.spring.repo;

import lk.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,String> {

    Customer findTopByOrderByIdDesc();

}
