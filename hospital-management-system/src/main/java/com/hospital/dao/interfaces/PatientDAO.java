package com.hospital.dao.interfaces;

import com.hospital.model.Patient;
import java.util.List;

public interface PatientDAO {
    Patient createPatient(Patient patient);
    Patient getPatientById(Long id);
    List<Patient> getAllPatients();
    Patient updatePatient(Patient patient);
    void deletePatient(Long id);
    List<Patient> getPatientsByDoctorId(Long doctorId);
}
