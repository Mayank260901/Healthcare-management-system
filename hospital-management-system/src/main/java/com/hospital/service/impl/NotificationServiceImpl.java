package com.hospital.service.impl;

import com.hospital.service.interfaces.NotificationService;
import com.hospital.util.EmailUtil;

public class NotificationServiceImpl implements NotificationService {

    private final EmailUtil emailUtil;

    public NotificationServiceImpl(EmailUtil emailUtil) {
        this.emailUtil = emailUtil;
    }

    @Override
    public void sendAppointmentReminder(Long appointmentId, String patientEmail) {
        String subject = "Appointment Reminder";
        String message = "This is a reminder for your upcoming appointment with ID: " + appointmentId;
        emailUtil.sendEmail(patientEmail, subject, message);
    }

    @Override
    public void sendDoctorAvailabilityNotification(String doctorEmail, boolean isAvailable) {
        String subject = "Doctor Availability Update";
        String message = "You are now marked as " + (isAvailable ? "available" : "unavailable");
        emailUtil.sendEmail(doctorEmail, subject, message);
    }
}
