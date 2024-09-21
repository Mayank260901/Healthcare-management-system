package com.hospital.dao.interfaces;

import com.hospital.model.AuditLog;
import java.util.List;

public interface AuditLogDAO{
    void logAction(AuditLog auditLog);
    List<AuditLog> getAllLogs();
    List<AuditLog> getLogsByUserId(Long userId);
}
