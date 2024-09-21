package com.hospital.service;

import com.hospital.model.Billing;
import com.hospital.model.Patient;

import java.util.List;

public interface ReportService {
    List<Billing> generateBillingReport();
    List<Patient> generatePatientReport();
}
