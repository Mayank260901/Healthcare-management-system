package com.hospital.dao.interfaces;

import com.hospital.model.User;
import com.hospital.model.enums.Role;
import java.util.List;

public interface UserDAO {
    User createUser(User user);
    User getUserById(Long id);
    User getUserByUsername(String username);
    List<User> getAllUsers();
    User updateUser(User user);
    void deleteUser(Long id);
    List<User> getUsersByRole(Role role);
}
