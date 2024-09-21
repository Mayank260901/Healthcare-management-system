package com.hospital.service.impl;

import com.hospital.dao.interfaces.FeedbackDAO;
import com.hospital.model.Feedback;
import com.hospital.service.interfaces.FeedbackService;

import javax.inject.Inject;
import java.util.List;

public class FeedbackServiceImpl implements FeedbackService {

    @Inject
    private FeedbackDAO feedbackDAO;

    @Override
    public Feedback submitFeedback(Feedback feedback) {
        return feedbackDAO.createFeedback(feedback);
    }

    @Override
    public List<Feedback> getAllFeedbacks() {
        return feedbackDAO.getAllFeedback();
    }
}
