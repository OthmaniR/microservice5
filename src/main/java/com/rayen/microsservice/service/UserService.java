package com.rayen.microsservice.service;

import com.rayen.microsservice.entities.Role;
import com.rayen.microsservice.entities.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);

    List<User> findAllUsers();
}

