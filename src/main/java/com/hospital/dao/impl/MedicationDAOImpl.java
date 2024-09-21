package com.hospital.dao.impl;

import com.hospital.dao.interfaces.MedicationDAO;
import com.hospital.model.Medication;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class MedicationDAOImpl implements MedicationDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public Medication createMedication(Medication medication) {
        entityManager.persist(medication);
        return medication;
    }

    @Override
    public Medication getMedicationById(Long id) {
        return entityManager.find(Medication.class, id);
    }

    @Override
    public List<Medication> getAllMedications() {
        return entityManager.createQuery("SELECT m FROM Medication m", Medication.class).getResultList();
    }

    @Override
    @Transactional
    public Medication updateMedication(Medication medication) {
        return entityManager.merge(medication);
    }

    @Override
    @Transactional
    public void deleteMedication(Long id) {
        Medication medication = getMedicationById(id);
        if (medication != null) {
            entityManager.remove(medication);
        }
    }
}
