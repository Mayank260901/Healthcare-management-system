package com.hospital.service.interfaces;

import com.hospital.model.Prescription;
import java.util.List;

public interface PrescriptionService {
    Prescription createPrescription(Prescription prescription);
    Prescription getPrescriptionById(Long id);
    List<Prescription> getAllPrescriptions();
    Prescription updatePrescription(Prescription prescription);
    void deletePrescription(Long id);
}
