package lk.spring.service.impl.service;

import lk.spring.service.impl.dto.AdminDTO;

import java.util.List;

public interface AdminService {
    void saveAdmin(AdminDTO dto);
    AdminDTO searchAdmin(String id);
    void updateAdmin(AdminDTO dto);
    void deleteAdmin(String id);
    List<AdminDTO> getAllAdmin();
}
