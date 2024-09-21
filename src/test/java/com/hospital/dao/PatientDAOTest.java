package com.hospital.dao;

import com.hospital.dao.impl.PatientDAOImpl;
import com.hospital.model.Patient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PatientDAOTest {

    private PatientDAOImpl patientDAO;

    @BeforeEach
    void setUp() {
        patientDAO = new PatientDAOImpl();
    }

    @Test
    void testAddPatient() {
        Patient patient = new Patient();
        patientDAO.createPatient(patient);
        assertNotNull(patient.getId());
    }

    @Test
    void testGetAllPatients() {
        List<Patient> patients = patientDAO.getAllPatients();
        assertNotNull(patients);
    }
}
