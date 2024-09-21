package com.hospital.dao;

import com.hospital.dao.impl.FeedbackDAOImpl;
import com.hospital.model.Feedback;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FeedbackDAOTest {

    private FeedbackDAOImpl feedbackDAO;

    @BeforeEach
    void setUp() {
        feedbackDAO = new FeedbackDAOImpl();
    }

    @Test
    void testAddFeedback() {
        Feedback feedback = new Feedback();
        feedbackDAO.createFeedback(feedback);
        assertNotNull(feedback.getId());
    }

    @Test
    void testGetAllFeedbacks() {
        List<Feedback> feedbackList = feedbackDAO.getAllFeedback();
        assertNotNull(feedbackList);
    }
}
