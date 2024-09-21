package com.hospital.dao.interfaces;

import com.hospital.model.Doctor;

import javax.print.Doc;
import java.util.List;

public interface DoctorDAO {
    Doctor createDoctor(Doctor doctor);
    Doctor getDoctorById(Long id);
    List<Doctor> getAllDoctors();
    Doctor updateDoctor(Doctor doctor);
    void deleteDoctor(Long id);
    List<Doctor> getDoctorsBySpecialization(String specialization);
}
