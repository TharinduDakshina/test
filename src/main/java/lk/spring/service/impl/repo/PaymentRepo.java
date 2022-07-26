package lk.spring.service.impl.repo;

import lk.spring.service.impl.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment,String> {
}
