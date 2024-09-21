package com.hospital.dao.interfaces;

import com.hospital.model.Feedback;
import java.util.List;

public interface FeedbackDAO{
    Feedback createFeedback(Feedback feedback);
    Feedback getFeedbackById(Long id);
    List<Feedback> getAllFeedback();
    List<Feedback> getFeedbackByDoctorId(Long doctorId);
    List<Feedback> getFeedbackByPatientId(Long patientId);
}
