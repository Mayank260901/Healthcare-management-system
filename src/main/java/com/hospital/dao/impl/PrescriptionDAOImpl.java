package com.hospital.dao.impl;

import com.hospital.dao.interfaces.PrescriptionDAO;
import com.hospital.model.Prescription;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class PrescriptionDAOImpl implements PrescriptionDAO {

    private final EntityManager entityManager;

    public PrescriptionDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // Create a new prescription
    @Override
    public Prescription createPrescription(Prescription prescription) {
        entityManager.getTransaction().begin();
        entityManager.persist(prescription);
        entityManager.getTransaction().commit();
        return prescription;
    }

    // Retrieve prescription by ID
    @Override
    public Prescription getPrescriptionById(Long id) {
        return entityManager.find(Prescription.class, id);
    }

    // Retrieve all prescriptions
    @Override
    public List<Prescription> getAllPrescriptions() {
        TypedQuery<Prescription> query = entityManager.createQuery("FROM Prescription", Prescription.class);
        return query.getResultList();
    }

    // Update prescription details
    @Override
    public Prescription updatePrescription(Prescription prescription) {
        entityManager.getTransaction().begin();
        Prescription updatedPrescription = entityManager.merge(prescription);
        entityManager.getTransaction().commit();
        return updatedPrescription;
    }

    // Delete prescription by ID
    @Override
    public void deletePrescription(Long id) {
        entityManager.getTransaction().begin();
        Prescription prescription = entityManager.find(Prescription.class, id);
        if (prescription != null) {
            entityManager.remove(prescription);
        }
        entityManager.getTransaction().commit();
    }

    // Retrieve prescriptions by patient ID
    @Override
    public List<Prescription> getPrescriptionsByPatientId(Long patientId) {
        TypedQuery<Prescription> query = entityManager.createQuery("FROM Prescription WHERE patient.id = :patientId", Prescription.class);
        query.setParameter("patientId", patientId);
        return query.getResultList();
    }

}
