package com.hospital.service.interfaces;

import com.hospital.model.Feedback;
import java.util.List;

public interface FeedbackService {
    Feedback submitFeedback(Feedback feedback);
    List<Feedback> getAllFeedbacks();
}
