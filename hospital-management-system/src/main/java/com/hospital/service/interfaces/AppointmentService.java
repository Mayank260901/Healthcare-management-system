package com.hospital.service.interfaces;

import com.hospital.model.Appointment;
import java.util.List;

public interface AppointmentService {
    Appointment createAppointment(Appointment appointment);
    Appointment getAppointmentById(Long id);
    List<Appointment> getAllAppointments();
    Appointment updateAppointment(Appointment appointment);
    void cancelAppointment(Long id);
}
