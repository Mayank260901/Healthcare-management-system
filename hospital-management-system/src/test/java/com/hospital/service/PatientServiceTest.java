package com.hospital.service;

import com.hospital.model.Patient;
import com.hospital.service.impl.PatientServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PatientServiceTest {

    private PatientServiceImpl patientService;

    @BeforeEach
    void setUp() {
        patientService = new PatientServiceImpl();
    }

    @Test
    void testCreatePatient() {
        Patient patient = new Patient();
        patientService.createPatient(patient);
        assertNotNull(patient.getId());
    }

    @Test
    void testGetAllPatients() {
        List<Patient> patients = patientService.getAllPatients();
        assertNotNull(patients);
    }
}

