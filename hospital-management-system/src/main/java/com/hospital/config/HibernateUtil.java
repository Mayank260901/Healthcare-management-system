package com.hospital.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

    private static final EntityManagerFactory entityManagerFactory;

    static {
        try {
            // Initialize EntityManagerFactory using the persistence unit defined in persistence.xml
            entityManagerFactory = Persistence.createEntityManagerFactory("hospital");
        } catch (Throwable ex) {
            System.err.println("Initial EntityManagerFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    // Method to provide an EntityManager instance
    public static EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

    // Closing EntityManagerFactory when application shuts down
    public static void shutdown() {
        if (entityManagerFactory != null && entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }
    }
}
