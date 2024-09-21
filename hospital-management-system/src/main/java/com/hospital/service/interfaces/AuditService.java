package com.hospital.service.interfaces;

import com.hospital.model.AuditLog;
import java.util.List;

public interface AuditService {
    void logAction(String action, String performedBy);
    List<AuditLog> getAllLogs();
    List<AuditLog> getLogsByUser(String username);
    void deleteLog(Long logId);
}
