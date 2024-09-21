package com.hospital.model;

import com.hospital.model.enums.Gender;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "gender", nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;

    @OneToMany(mappedBy = "patient")
    private List<Billing> billingRecords;

    // Constructors, Getters, Setters, toString, etc.

    public Patient() {
    }

    public Patient(Long id, String name, int age, Gender gender, List<Appointment> appointments, List<Billing> billingRecords) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.appointments = appointments;
        this.billingRecords = billingRecords;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public List<Billing> getBillingRecords() {
        return billingRecords;
    }

    public void setBillingRecords(List<Billing> billingRecords) {
        this.billingRecords = billingRecords;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", appointments=" + appointments +
                ", billingRecords=" + billingRecords +
                '}';
    }
}
