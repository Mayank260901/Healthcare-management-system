package com.hospital.dao.impl;

import com.hospital.dao.interfaces.AuditLogDAO;
import com.hospital.model.AuditLog;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class AuditLogDAOImpl implements AuditLogDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void logAction(AuditLog auditLog) {
        entityManager.persist(auditLog);
    }

    @Override
    public List<AuditLog> getAllLogs() {
        return entityManager.createQuery("SELECT a FROM AuditLog a", AuditLog.class).getResultList();
    }

    @Override
    public List<AuditLog> getLogsByUserId(Long userId) {
        return entityManager.createQuery("SELECT a FROM AuditLog a WHERE a.user.id = :userId", AuditLog.class)
                .setParameter("userId", userId)
                .getResultList();
    }
}
