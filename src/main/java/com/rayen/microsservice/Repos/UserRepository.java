package com.rayen.microsservice.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rayen.microsservice.entities.User;
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}