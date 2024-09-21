package com.hospital.service.interfaces;

import com.hospital.model.Medication;
import java.util.List;

public interface MedicationService {
    void addMedication(Medication medication);
    Medication getMedicationById(Long id);
    List<Medication> getAllMedications();
    Medication updateMedication(Medication medication);
    void deleteMedication(Long id);
}
