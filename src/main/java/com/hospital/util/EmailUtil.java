package com.hospital.util;

public class EmailUtil {

    public void sendEmail(String to, String subject, String message) {
        // In a real application, implement the logic to send an email using JavaMail API or an external service
        System.out.println("Sending email to " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);
    }
}
