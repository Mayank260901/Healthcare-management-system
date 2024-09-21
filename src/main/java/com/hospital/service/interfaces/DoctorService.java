package com.hospital.service.interfaces;

import com.hospital.model.Doctor;
import java.util.List;

public interface DoctorService {
    Doctor createDoctor(Doctor doctor);
    Doctor getDoctorById(Long id);
    List<Doctor> getAllDoctors();
    Doctor updateDoctor(Doctor doctor);
    void deleteDoctor(Long id);
}
