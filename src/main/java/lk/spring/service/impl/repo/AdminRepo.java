package lk.spring.service.impl.repo;

import lk.spring.service.impl.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin,String> {
}
