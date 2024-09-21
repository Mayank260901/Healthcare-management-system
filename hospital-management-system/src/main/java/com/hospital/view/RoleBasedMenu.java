package com.hospital.view;

public class RoleBasedMenu {

    private final AdminView adminView;
    private final DoctorView doctorView;
    private final ReceptionView receptionView;

    
    public RoleBasedMenu(AdminView adminView, DoctorView doctorView, ReceptionView receptionView) {
        this.adminView = adminView;
        this.doctorView = doctorView;
        this.receptionView = receptionView;
    }

    // Display the appropriate menu based on the user's role
    public void displayMenu(String role) {
        switch (role.toUpperCase()) {
            case "ADMIN":
                adminView.displayAdminMenu();
                break;
            case "DOCTOR":
                doctorView.displayDoctorMenu();
                break;
            case "RECEPTIONIST":
                receptionView.displayReceptionMenu();
                break;
            default:
                System.out.println("Invalid role. Please try again.");
        }
    }
}

