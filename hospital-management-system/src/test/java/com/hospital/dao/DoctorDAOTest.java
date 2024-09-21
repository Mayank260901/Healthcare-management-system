package com.hospital.dao;

import com.hospital.dao.impl.DoctorDAOImpl;
import com.hospital.model.Doctor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoctorDAOTest {

    private DoctorDAOImpl doctorDAO;

    @BeforeEach
    void setUp() {
        doctorDAO = new DoctorDAOImpl();
    }

    @Test
    void testAddDoctor() {
        Doctor doctor = new Doctor();
        doctorDAO.createDoctor(doctor);
        assertNotNull(doctor.getId());
    }

    @Test
    void testGetAllDoctors() {
        List<Doctor> doctors = doctorDAO.getAllDoctors();
        assertNotNull(doctors);
    }
}
