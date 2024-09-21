package com.hospital.dao.impl;

import com.hospital.dao.interfaces.BillingDAO;
import com.hospital.model.Billing;
import com.hospital.model.enums.BillingStatus;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class BillingDAOImpl implements BillingDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public Billing createBillingRecord(Billing billing) {
        entityManager.persist(billing);
        return billing;
    }

    @Override
    public Billing getBillingRecordById(Long id) {
        return entityManager.find(Billing.class, id);
    }

    @Override
    public List<Billing> getAllBillingRecords() {
        return entityManager.createQuery("SELECT b FROM Billing b", Billing.class).getResultList();
    }

    @Override
    public List<Billing> getBillingRecordsByPatientId(Long patientId) {
        return entityManager.createQuery("SELECT b FROM Billing b WHERE b.patient.id = :patientId", Billing.class)
                .setParameter("patientId", patientId)
                .getResultList();
    }

    @Override
    public List<Billing> getBillingRecordsByStatus(BillingStatus status) {
        return entityManager.createQuery("SELECT b FROM Billing b WHERE b.status = :status", Billing.class)
                .setParameter("status", status)
                .getResultList();
    }

    @Override
    @Transactional
    public Billing updateBillingRecord(Billing billing) {
        return entityManager.merge(billing);
    }

    @Override
    @Transactional
    public void deleteBillingRecord(Long id) {
        Billing billing = getBillingRecordById(id);
        if (billing != null) {
            entityManager.remove(billing);
        }
    }
}
