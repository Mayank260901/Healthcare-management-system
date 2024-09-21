package com.hospital.dao;

import com.hospital.dao.impl.UserDAOImpl;
import com.hospital.model.User;
import com.hospital.model.enums.Role;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserDAOTest {

    private UserDAOImpl userDAO;

    @BeforeEach
    void setUp() {
        userDAO = new UserDAOImpl();
    }

    @Test
    void testAddUser() {
        User user = new User();
        userDAO.createUser(user);
        assertNotNull(user.getId());
    }

    @Test
    void testGetUserByRole() {
        String roleString = "ADMIN"; // Example role string
        Role role = Role.valueOf(roleString); // Converts String to Role enum
        List<User> user = userDAO.getUsersByRole(role);
        assertNotNull(user);
    }
}
