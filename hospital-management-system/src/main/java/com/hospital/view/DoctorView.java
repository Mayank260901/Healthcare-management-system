package com.hospital.view;

import com.hospital.service.interfaces.AppointmentService;
import com.hospital.service.interfaces.FeedbackService;
import com.hospital.service.interfaces.PatientService;

import java.util.Scanner;

public class DoctorView {

    private final AppointmentService appointmentService;
    private final PatientService patientService;
    private final FeedbackService feedbackService;

    public DoctorView(AppointmentService appointmentService, PatientService patientService, FeedbackService feedbackService) {
        this.appointmentService = appointmentService;
        this.patientService = patientService;
        this.feedbackService = feedbackService;
    }

    // Display menu for doctor-specific actions
    public void displayDoctorMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Doctor Menu ===");
            System.out.println("1. View Appointments");
            System.out.println("2. View Patients");
            System.out.println("3. View Feedback");
            System.out.println("0. Logout");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewAppointments();
                    break;
                case 2:
                    viewPatients();
                    break;
                case 3:
                    viewFeedback();
                    break;
                case 0:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    private void viewAppointments() {
        // Logic to view doctor’s appointments
    }

    private void viewPatients() {
        // Logic to view doctor’s patients
    }

    private void viewFeedback() {
        // Logic to view feedback
    }
}

