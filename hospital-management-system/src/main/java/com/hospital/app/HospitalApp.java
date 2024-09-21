package com.hospital.app;

import com.hospital.config.AuthService;
import com.hospital.view.AdminView;
import com.hospital.view.RoleBasedMenu;

import java.util.Scanner;

public class HospitalApp {

    public static void main(String[] args) {
        AuthService authService = new AuthService();
        RoleBasedMenu roleBasedMenu = new RoleBasedMenu();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Hospital Management System");

        boolean authenticated = false;
        while (!authenticated) {
            System.out.println("Please login to continue:");
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            try {
                authenticated = authService.login(username, password);
                if (authenticated) {
                    String role = authService.getUserRole(username);
                    roleBasedMenu.displayMenu(role);
                }
            } catch (Exception e) {
                System.out.println("Login failed: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
