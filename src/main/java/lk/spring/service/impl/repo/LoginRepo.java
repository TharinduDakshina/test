package lk.spring.service.impl.repo;

import lk.spring.service.impl.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepo extends JpaRepository<Login,String> {
}
