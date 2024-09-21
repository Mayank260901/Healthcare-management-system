package com.hospital.dao.impl;

import com.hospital.dao.interfaces.FeedbackDAO;
import com.hospital.model.Feedback;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class FeedbackDAOImpl implements FeedbackDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public Feedback createFeedback(Feedback feedback) {
        entityManager.persist(feedback);
        return feedback;
    }

    @Override
    public Feedback getFeedbackById(Long id) {
        return entityManager.find(Feedback.class, id);
    }

    @Override
    public List<Feedback> getAllFeedback() {
        return entityManager.createQuery("SELECT f FROM Feedback f", Feedback.class).getResultList();
    }

    @Override
    public List<Feedback> getFeedbackByDoctorId(Long doctorId) {
        return entityManager.createQuery("SELECT f FROM Feedback f WHERE f.doctor.id = :doctorId", Feedback.class)
                .setParameter("doctorId", doctorId)
                .getResultList();
    }

    @Override
    public List<Feedback> getFeedbackByPatientId(Long patientId) {
        return entityManager.createQuery("SELECT f FROM Feedback f WHERE f.patient.id = :patientId", Feedback.class)
                .setParameter("patientId", patientId)
                .getResultList();
    }
}
