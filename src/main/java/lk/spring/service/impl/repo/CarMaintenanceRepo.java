package lk.spring.service.impl.repo;

import lk.spring.service.impl.entity.Maintaince;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarMaintenanceRepo extends JpaRepository<Maintaince,String> {
}
