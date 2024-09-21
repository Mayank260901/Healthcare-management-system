package com.hospital.service.impl;

import com.hospital.dao.interfaces.AppointmentDAO;
import com.hospital.model.Appointment;
import com.hospital.service.interfaces.AppointmentService;

import javax.inject.Inject;
import java.util.List;

public class AppointmentServiceImpl implements AppointmentService {

    @Inject
    private AppointmentDAO appointmentDAO;

    @Override
    public Appointment createAppointment(Appointment appointment) {
        return appointmentDAO.createAppointment(appointment);
    }

    @Override
    public Appointment getAppointmentById(Long id) {
        return appointmentDAO.getAppointmentById(id);
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentDAO.getAllAppointments();
    }

    @Override
    public Appointment updateAppointment(Appointment appointment) {
        return appointmentDAO.updateAppointment(appointment);
    }

    @Override
    public void cancelAppointment(Long id) {
        appointmentDAO.deleteAppointment(id);
    }
}
