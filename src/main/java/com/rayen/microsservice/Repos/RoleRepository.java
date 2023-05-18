package com.rayen.microsservice.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rayen.microsservice.entities.Role;
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRole(String role);
}