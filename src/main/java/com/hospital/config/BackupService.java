package com.hospital.config;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import com.hospital.dao.impl.AuditLogDAOImpl;
import com.hospital.model.AuditLog;

public class BackupService {

    private final AuditLogDAOImpl auditLogDAO;

    public BackupService() {
        this.auditLogDAO = new AuditLogDAOImpl();
    }

    // Method to backup audit logs to a CSV file
    public void backupAuditLogs() {
        List<AuditLog> auditLogs = auditLogDAO.getAllLogs();
        String backupFileName = "backup_audit_log_" + LocalDateTime.now() + ".csv";

        try (FileWriter writer = new FileWriter(backupFileName)) {
            writer.write("Timestamp,Action,User,Details\n");

            for (AuditLog log : auditLogs) {
                writer.write(String.format("%s,%s,%s,%s\n",
                        log.getTimestamp(),
                        log.getAction(),
                        log.getUser().getUsername(),
                        log.getId()));
            }

            System.out.println("Backup successful: " + backupFileName);

        } catch (IOException e) {
            System.err.println("Error during backup: " + e.getMessage());
        }
    }
}
