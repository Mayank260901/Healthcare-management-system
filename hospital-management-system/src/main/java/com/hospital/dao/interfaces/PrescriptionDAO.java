package com.hospital.dao.interfaces;

import com.hospital.model.Prescription;
import java.util.List;

public interface PrescriptionDAO {
    Prescription createPrescription(Prescription prescription);
    Prescription getPrescriptionById(Long id);
    List<Prescription> getAllPrescriptions();
    Prescription updatePrescription(Prescription prescription);
    void deletePrescription(Long id);
    List<Prescription> getPrescriptionsByPatientId(Long patientId);
}
