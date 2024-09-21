package com.hospital.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GlobalExceptionHandler {

    private static final Logger LOGGER = Logger.getLogger(GlobalExceptionHandler.class.getName());

    // Handle general exceptions
    public static void handleException(Exception e) {
        LOGGER.log(Level.SEVERE, "An unexpected error occurred: ", e);
        System.out.println("An error occurred. Please try again later.");
    }

    // Handle specific exceptions
    public static void handleCustomException(RuntimeException e) {
        LOGGER.log(Level.WARNING, "A custom error occurred: ", e);
        System.out.println(e.getMessage());
    }
}
