package com.hospital.service.interfaces;

import com.hospital.model.Patient;
import java.util.List;

public interface PatientService {
    Patient createPatient(Patient patient);
    Patient getPatientById(Long id);
    List<Patient> getAllPatients();
    Patient updatePatient(Patient patient);
    void deletePatient(Long id);
}
