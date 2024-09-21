package com.hospital.service;

import com.hospital.model.Medication;
import com.hospital.service.impl.MedicationServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MedicationServiceTest {

    private MedicationServiceImpl medicationService;

    @BeforeEach
    void setUp() {
        medicationService = new MedicationServiceImpl();
    }

    @Test
    void testCreateMedication() {
        Medication medication = new Medication();
        medicationService.addMedication(medication);
        assertNotNull(medication.getId());
    }

    @Test
    void testGetAllMedications() {
        List<Medication> medications = medicationService.getAllMedications();
        assertNotNull(medications);
    }
}
