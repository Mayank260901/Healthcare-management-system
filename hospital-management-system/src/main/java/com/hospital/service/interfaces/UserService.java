package com.hospital.service;

import com.hospital.model.User;
import com.hospital.model.enums.Role;

import java.util.List;

public interface UserService {
    void registerUser(User user);
    User authenticate(String username, String password);
    List<User> getAllUsers();
    List<User> getUsersByRole(Role role);
    void updateUser(User user);
    void deleteUser(Long userId);
}
