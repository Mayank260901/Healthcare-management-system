package com.hospital.service;

import com.hospital.model.Appointment;
import com.hospital.service.impl.AppointmentServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentServiceTest {

    private AppointmentServiceImpl appointmentService;

    @BeforeEach
    void setUp() {
        appointmentService = new AppointmentServiceImpl();
    }

    @Test
    void testCreateAppointment() {
        Appointment appointment = new Appointment();
        appointmentService.createAppointment(appointment);
        assertNotNull(appointment.getId());
    }

    @Test
    void testGetAllAppointments() {
        List<Appointment> appointments = appointmentService.getAllAppointments();
        assertNotNull(appointments);
    }
}
