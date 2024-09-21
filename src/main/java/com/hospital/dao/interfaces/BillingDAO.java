package com.hospital.dao.interfaces;

import com.hospital.model.Billing;
import com.hospital.model.enums.BillingStatus;
import java.util.List;

public interface BillingDAO {
    Billing createBillingRecord(Billing billing);
    Billing getBillingRecordById(Long id);
    List<Billing> getAllBillingRecords();
    List<Billing> getBillingRecordsByPatientId(Long patientId);
    List<Billing> getBillingRecordsByStatus(BillingStatus status);
    Billing updateBillingRecord(Billing billing);
    void deleteBillingRecord(Long id);
}
