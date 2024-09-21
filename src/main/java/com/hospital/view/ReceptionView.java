package com.hospital.view;

import com.hospital.service.interfaces.AppointmentService;
import com.hospital.service.interfaces.PatientService;
import com.hospital.service.interfaces.BillingService;

import java.util.Scanner;

public class ReceptionView {

    private final AppointmentService appointmentService;
    private final PatientService patientService;
    private final BillingService billingService;

    public ReceptionView(AppointmentService appointmentService, PatientService patientService, BillingService billingService) {
        this.appointmentService = appointmentService;
        this.patientService = patientService;
        this.billingService = billingService;
    }

    // Display menu for receptionist-specific actions
    public void displayReceptionMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Receptionist Menu ===");
            System.out.println("1. Manage Appointments");
            System.out.println("2. Manage Patients");
            System.out.println("3. Manage Billing");
            System.out.println("0. Logout");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manageAppointments();
                    break;
                case 2:
                    managePatients();
                    break;
                case 3:
                    manageBilling();
                    break;
                case 0:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    private void manageAppointments() {
        // Logic to manage appointments
    }

    private void managePatients() {
        // Logic to manage patients
    }

    private void manageBilling() {
        // Logic to manage billing
    }
}
