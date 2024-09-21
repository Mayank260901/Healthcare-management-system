package com.hospital.dao.interfaces;

import com.hospital.model.Medication;
import java.util.List;

public interface MedicationDAO {
    Medication createMedication(Medication medication);
    Medication getMedicationById(Long id);
    List<Medication> getAllMedications();
    Medication updateMedication(Medication medication);
    void deleteMedication(Long id);
}
