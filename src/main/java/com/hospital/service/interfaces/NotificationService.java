package com.hospital.service.interfaces;

public interface NotificationService {
    void sendAppointmentReminder(Long appointmentId, String patientEmail);
    void sendDoctorAvailabilityNotification(String doctorEmail, boolean isAvailable);
}
