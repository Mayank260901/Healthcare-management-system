package com.hospital.dao.impl;

import com.hospital.dao.interfaces.AppointmentDAO;
import com.hospital.model.Appointment;
import com.hospital.model.enums.AppointmentStatus;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class AppointmentDAOImpl implements AppointmentDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public Appointment createAppointment(Appointment appointment) {
        entityManager.persist(appointment);
        return appointment;
    }

    @Override
    public Appointment getAppointmentById(Long id) {
        return entityManager.find(Appointment.class, id);
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return entityManager.createQuery("SELECT a FROM Appointment a", Appointment.class).getResultList();
    }

    @Override
    public List<Appointment> getAppointmentsByDoctorId(Long doctorId) {
        return entityManager.createQuery("SELECT a FROM Appointment a WHERE a.doctor.id = :doctorId", Appointment.class)
                .setParameter("doctorId", doctorId)
                .getResultList();
    }

    @Override
    public List<Appointment> getAppointmentsByPatientId(Long patientId) {
        return entityManager.createQuery("SELECT a FROM Appointment a WHERE a.patient.id = :patientId", Appointment.class)
                .setParameter("patientId", patientId)
                .getResultList();
    }

    @Override
    public List<Appointment> getAppointmentsByStatus(AppointmentStatus status) {
        return entityManager.createQuery("SELECT a FROM Appointment a WHERE a.status = :status", Appointment.class)
                .setParameter("status", status)
                .getResultList();
    }

    @Override
    @Transactional
    public Appointment updateAppointment(Appointment appointment) {
        return entityManager.merge(appointment);
    }

    @Override
    @Transactional
    public void deleteAppointment(Long id) {
        Appointment appointment = getAppointmentById(id);
        if (appointment != null) {
            entityManager.remove(appointment);
        }
    }
}
