package com.hospital.service.impl;

import com.hospital.dao.interfaces.BillingDAO;
import com.hospital.model.Billing;
import com.hospital.service.interfaces.BillingService;

import javax.inject.Inject;
import java.util.List;

public class BillingServiceImpl implements BillingService {

    @Inject
    private BillingDAO billingDAO;

    @Override
    public Billing createBilling(Billing billing) {
        return billingDAO.createBillingRecord(billing);
    }

    @Override
    public Billing getBillingById(Long id) {
        return billingDAO.getBillingRecordById(id);
    }

    @Override
    public List<Billing> getAllBillings() {
        return billingDAO.getAllBillingRecords();
    }

    @Override
    public Billing updateBilling(Billing billing) {
        return billingDAO.updateBillingRecord(billing);
    }

    @Override
    public void deleteBilling(Long id) {
        billingDAO.deleteBillingRecord(id);
    }
}
