package com.hospital.service;

import com.hospital.model.Doctor;
import com.hospital.service.impl.DoctorServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorServiceTest {

    private DoctorServiceImpl doctorService;

    @BeforeEach
    void setUp() {
        doctorService = new DoctorServiceImpl();
    }

    @Test
    void testAddDoctor() {
        Doctor doctor = new Doctor();
        doctorService.createDoctor(doctor);
        assertNotNull(doctor.getId());
    }

    @Test
    void testGetAllDoctors() {
        assertNotNull(doctorService.getAllDoctors());
    }
}
