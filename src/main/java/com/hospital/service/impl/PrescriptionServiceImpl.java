package com.hospital.service.impl;

import com.hospital.dao.interfaces.PrescriptionDAO;
import com.hospital.model.Prescription;
import com.hospital.service.interfaces.PrescriptionService;

import javax.inject.Inject;
import java.util.List;

public class PrescriptionServiceImpl implements PrescriptionService {

    @Inject
    private PrescriptionDAO prescriptionDAO;

    @Override
    public Prescription createPrescription(Prescription prescription) {
        return prescriptionDAO.createPrescription(prescription);
    }

    @Override
    public Prescription getPrescriptionById(Long id) {
        return prescriptionDAO.getPrescriptionById(id);
    }

    @Override
    public List<Prescription> getAllPrescriptions() {
        return prescriptionDAO.getAllPrescriptions();
    }

    @Override
    public Prescription updatePrescription(Prescription prescription) {
        return prescriptionDAO.updatePrescription(prescription);
    }

    @Override
    public void deletePrescription(Long id) {
        prescriptionDAO.deletePrescription(id);
    }
}
