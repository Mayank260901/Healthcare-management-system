package com.hospital.service.impl;

import com.hospital.dao.interfaces.AuditLogDAO;
import com.hospital.model.AuditLog;
import com.hospital.service.interfaces.AuditService;

import java.util.List;

public class AuditServiceImpl implements AuditService {

    private final AuditLogDAO auditLogDAO;

    public AuditServiceImpl(AuditLogDAO auditLogDAO) {
        this.auditLogDAO = auditLogDAO;
    }

    @Override
    public void logAction(String action, String performedBy) {
        AuditLog log = new AuditLog(action, performedBy);
        auditLogDAO.save(log);
    }

    @Override
    public List<AuditLog> getAllLogs() {
        return auditLogDAO.getAllLogs();
    }

    @Override
    public List<AuditLog> getLogsByUser(String username) {
        return auditLogDAO.getLogByUser(username);
    }

    @Override
    public void deleteLog(Long logId) {
        auditLogDAO.deleteLog(logId);
    }
}
