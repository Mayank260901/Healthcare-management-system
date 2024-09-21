package com.hospital.dao;

import com.hospital.dao.impl.AppointmentDAOImpl;
import com.hospital.model.Appointment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentDAOTest {

    private AppointmentDAOImpl appointmentDAO;

    @BeforeEach
    void setUp() {
        appointmentDAO = new AppointmentDAOImpl();
    }

    @Test
    void testCreateAppointment() {
        Appointment appointment = new Appointment();
        appointmentDAO.createAppointment(appointment);
        assertNotNull(appointment.getId());
    }

    @Test
    void testGetAppointments() {
        List<Appointment> appointments = appointmentDAO.getAllAppointments();
        assertNotNull(appointments);
    }
}
