package com.hospital.view;

import com.hospital.service.ReportService;
import com.hospital.service.UserService;
import com.hospital.service.interfaces.AppointmentService;
import com.hospital.service.interfaces.DoctorService;

import java.util.Scanner;

public class AdminView {

    private final AppointmentService appointmentService;
    private final DoctorService doctorService;
    private final UserService userService;
    private final ReportService reportService;

    public AdminView(AppointmentService appointmentService, DoctorService doctorService, UserService userService, ReportService reportService) {
        this.appointmentService = appointmentService;
        this.doctorService = doctorService;
        this.userService = userService;
        this.reportService = reportService;
    }

    // Display menu for admin-specific actions
    public void displayAdminMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Admin Menu ===");
            System.out.println("1. Manage Users");
            System.out.println("2. Manage Doctors");
            System.out.println("3. View Reports");
            System.out.println("4. Manage Appointments");
            System.out.println("0. Logout");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manageUsers();
                    break;
                case 2:
                    manageDoctors();
                    break;
                case 3:
                    viewReports();
                    break;
                case 4:
                    manageAppointments();
                    break;
                case 0:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    private void manageUsers() {
        // Logic for managing users
    }

    private void manageDoctors() {
        // Logic for managing doctors
    }

    private void viewReports() {
        // Logic for viewing reports
    }

    private void manageAppointments() {
        // Logic for managing appointments
    }

}
