package com.hospital.service.impl;

import com.hospital.dao.interfaces.DoctorDAO;
import com.hospital.model.Doctor;
import com.hospital.service.interfaces.DoctorService;

import javax.inject.Inject;
import java.util.List;

public class DoctorServiceImpl implements DoctorService {

    @Inject
    private DoctorDAO doctorDAO;

    @Override
    public Doctor createDoctor(Doctor doctor) {
        return doctorDAO.createDoctor(doctor);
    }

    @Override
    public Doctor getDoctorById(Long id) {
        return doctorDAO.getDoctorById(id);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorDAO.getAllDoctors();
    }

    @Override
    public Doctor updateDoctor(Doctor doctor) {
        return doctorDAO.updateDoctor(doctor);
    }

    @Override
    public void deleteDoctor(Long id) {
        doctorDAO.deleteDoctor(id);
    }
}
