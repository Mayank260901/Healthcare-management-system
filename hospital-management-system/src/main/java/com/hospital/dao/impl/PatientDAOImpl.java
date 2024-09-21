package com.hospital.dao.impl;

import com.hospital.dao.interfaces.PatientDAO;
import com.hospital.model.Patient;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class PatientDAOImpl implements PatientDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public Patient createPatient(Patient patient) {
        entityManager.persist(patient);
        return patient;
    }

    @Override
    public Patient getPatientById(Long id) {
        return entityManager.find(Patient.class, id);
    }

    @Override
    public List<Patient> getAllPatients() {
        return entityManager.createQuery("SELECT p FROM Patient p", Patient.class).getResultList();
    }

    @Override
    public List<Patient> getPatientsByDoctorId(Long doctorId) {
        return entityManager.createQuery("SELECT p FROM Patient p WHERE p.doctor.id = :doctorId", Patient.class)
                .setParameter("doctorId", doctorId)
                .getResultList();
    }

    @Override
    @Transactional
    public Patient updatePatient(Patient patient) {
        return entityManager.merge(patient);
    }

    @Override
    @Transactional
    public void deletePatient(Long id) {
        Patient patient = getPatientById(id);
        if (patient != null) {
            entityManager.remove(patient);
        }
    }
}
