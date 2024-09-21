package com.hospital.model;

import com.hospital.model.enums.BillingStatus;
import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "billing")
public class Billing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private BillingStatus status;

    @Column(name = "billing_date", nullable = false)
    private LocalDateTime billingDate;

    // Constructors, Getters, Setters, toString, etc.


    public Billing() {
    }

    public Billing(Long id, Patient patient, BigDecimal amount, BillingStatus status, LocalDateTime billingDate) {
        this.id = id;
        this.patient = patient;
        this.amount = amount;
        this.status = status;
        this.billingDate = billingDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BillingStatus getStatus() {
        return status;
    }

    public void setStatus(BillingStatus status) {
        this.status = status;
    }

    public LocalDateTime getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(LocalDateTime billingDate) {
        this.billingDate = billingDate;
    }

    @Override
    public String toString() {
        return "Billing{" +
                "id=" + id +
                ", patient=" + patient +
                ", amount=" + amount +
                ", status=" + status +
                ", billingDate=" + billingDate +
                '}';
    }
}
