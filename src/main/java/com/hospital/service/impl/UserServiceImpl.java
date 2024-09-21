package com.hospital.service.impl;

import com.hospital.dao.interfaces.UserDAO;
import com.hospital.model.User;
import com.hospital.model.enums.Role;
import com.hospital.service.UserService;
import com.hospital.exception.AuthenticationException;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void registerUser(User user) {
        userDAO.createUser(user);
    }

    @Override
    public User authenticate(String username, String password) {
        User user = userDAO.getUserByUsername(username);
        if (user == null || !user.getPassword().equals(password)) {
            throw new AuthenticationException("Invalid username or password");
        }
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public List<User> getUsersByRole(Role role) {
        return userDAO.getUsersByRole(role);
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    public void deleteUser(Long userId) {
        userDAO.deleteUser(userId);
    }
}
