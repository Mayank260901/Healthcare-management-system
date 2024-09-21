package com.hospital.service;

import com.hospital.model.Billing;
import com.hospital.service.impl.BillingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillingServiceTest {

    private BillingServiceImpl billingService;

    @BeforeEach
    void setUp() {
        billingService = new BillingServiceImpl();
    }

    @Test
    void testCreateBilling() {
        Billing billing = new Billing();
        billingService.createBilling(billing);
        assertNotNull(billing.getId());
    }

    @Test
    void testGetBillingById() {
        Billing billing = billingService.getBillingById(1L);
        assertNotNull(billing);
    }
}
