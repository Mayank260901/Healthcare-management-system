package com.hospital.service.impl;

import com.hospital.dao.interfaces.BillingDAO;
import com.hospital.dao.interfaces.PatientDAO;
import com.hospital.model.Billing;
import com.hospital.model.Patient;
import com.hospital.service.ReportService;

import java.util.List;

public class ReportServiceImpl implements ReportService {

    private final BillingDAO billingDAO;
    private final PatientDAO patientDAO;

    public ReportServiceImpl(BillingDAO billingDAO, PatientDAO patientDAO) {
        this.billingDAO = billingDAO;
        this.patientDAO = patientDAO;
    }

    @Override
    public List<Billing> generateBillingReport() {
        return billingDAO.getAll();
    }

    @Override
    public List<Patient> generatePatientReport() {
        return patientDAO.getAll();
    }
}
