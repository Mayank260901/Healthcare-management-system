package com.hospital.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptionService {

    // Encrypt a plain text using SHA-256 hashing
    public static String encryptPassword(String password) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] hash = messageDigest.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder();

            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            System.err.println("Error during password encryption: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    // Compare raw password and encrypted password
    public static boolean checkPassword(String rawPassword, String encryptedPassword) {
        return encryptPassword(rawPassword).equals(encryptedPassword);
    }
}
