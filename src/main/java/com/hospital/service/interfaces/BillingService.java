package com.hospital.service.interfaces;

import com.hospital.model.Billing;
import java.util.List;

public interface BillingService {
    Billing createBilling(Billing billing);
    Billing getBillingById(Long id);
    List<Billing> getAllBillings();
    Billing updateBilling(Billing billing);
    void deleteBilling(Long id);
}
