package com.hospital.dao.impl;

import com.hospital.dao.interfaces.DoctorDAO;
import com.hospital.model.Doctor;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class DoctorDAOImpl implements DoctorDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public Doctor createDoctor(Doctor doctor) {
        entityManager.persist(doctor);
        return doctor;
    }

    @Override
    public Doctor getDoctorById(Long id) {
        return entityManager.find(Doctor.class, id);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return entityManager.createQuery("SELECT d FROM Doctor d", Doctor.class).getResultList();
    }

    @Override
    public List<Doctor> getDoctorsBySpecialization(String specialization) {
        return entityManager.createQuery("SELECT d FROM Doctor d WHERE d.specialization = :specialization", Doctor.class)
                .setParameter("specialization", specialization)
                .getResultList();
    }

    @Override
    @Transactional
    public Doctor updateDoctor(Doctor doctor) {
        return entityManager.merge(doctor);
    }

    @Override
    @Transactional
    public void deleteDoctor(Long id) {
        Doctor doctor = getDoctorById(id);
        if (doctor != null) {
            entityManager.remove(doctor);
        }
    }
}
