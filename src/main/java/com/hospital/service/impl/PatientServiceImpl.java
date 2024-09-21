package com.hospital.service.impl;

import com.hospital.dao.interfaces.PatientDAO;
import com.hospital.model.Patient;
import com.hospital.service.interfaces.PatientService;

import javax.inject.Inject;
import java.util.List;

public class PatientServiceImpl implements PatientService {

    @Inject
    private PatientDAO patientDAO;

    @Override
    public Patient createPatient(Patient patient) {
        return patientDAO.createPatient(patient);
    }

    @Override
    public Patient getPatientById(Long id) {
        return patientDAO.getPatientById(id);
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientDAO.getAllPatients();
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return patientDAO.updatePatient(patient);
    }

    @Override
    public void deletePatient(Long id) {
        patientDAO.deletePatient(id);
    }
}
