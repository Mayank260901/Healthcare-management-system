package com.hospital.service.impl;

import com.hospital.dao.interfaces.MedicationDAO;
import com.hospital.model.Medication;
import com.hospital.service.interfaces.MedicationService;

import javax.inject.Inject;
import java.util.List;

public class MedicationServiceImpl implements MedicationService {

    @Inject
    private MedicationDAO medicationDAO;

    @Override
    public void addMedication(Medication medication) {
        medicationDAO.createMedication(medication);
    }

    @Override
    public Medication getMedicationById(Long id) {
        return medicationDAO.getMedicationById(id);
    }

    @Override
    public List<Medication> getAllMedications() {
        return medicationDAO.getAllMedications();
    }

    @Override
    public Medication updateMedication(Medication medication) {
        return medicationDAO.updateMedication(medication);
    }

    @Override
    public void deleteMedication(Long id) {
        medicationDAO.deleteMedication(id);
    }
}
