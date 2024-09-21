package com.hospital.config;

import com.hospital.dao.interfaces.UserDAO;
import com.hospital.dao.impl.UserDAOImpl;
import com.hospital.model.User;
import com.hospital.model.enums.Role;

import java.util.Optional;

public class AuthService {

    private final UserDAO userDAO;

    public AuthService() {
        this.userDAO = new UserDAOImpl();
    }

    // Method to authenticate user based on username and password
    public boolean login(String username, String password) throws Exception {
        Optional<User> userOpt = userDAO.getUserByUsername(username);

        if (userOpt.isPresent()) {
            User user = userOpt.get();
            // Assuming password validation is plain text for simplicity, you can integrate encryption later
            if (user.getPassword().equals(password)) {
                System.out.println("Login successful!");
                return true;
            } else {
                throw new Exception("Invalid password.");
            }
        } else {
            throw new Exception("User not found.");
        }
    }

    // Method to retrieve user role after successful login
    public String getUserRole(String username) throws Exception {
        Optional<User> userOpt = userDAO.getUserByUsername(username);

        if (userOpt.isPresent()) {
            return userOpt.get().getRole().name();
        } else {
            throw new Exception("User not found.");
        }
    }
}
