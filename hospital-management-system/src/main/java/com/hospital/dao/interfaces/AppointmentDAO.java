package com.hospital.dao.interfaces;

import com.hospital.model.Appointment;
import com.hospital.model.enums.AppointmentStatus;
import java.util.List;

public interface AppointmentDAO {
    Appointment createAppointment(Appointment appointment);
    Appointment getAppointmentById(Long id);
    List<Appointment> getAllAppointments();
    List<Appointment> getAppointmentsByDoctorId(Long doctorId);
    List<Appointment> getAppointmentsByPatientId(Long patientId);
    List<Appointment> getAppointmentsByStatus(AppointmentStatus status);
    Appointment updateAppointment(Appointment appointment);
    void deleteAppointment(Long id);
}
