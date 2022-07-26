package lk.spring.service.impl.repo;

import lk.spring.service.impl.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepo extends JpaRepository<Booking,String> {

    Booking findTopByOrderByIdDesc();
}
