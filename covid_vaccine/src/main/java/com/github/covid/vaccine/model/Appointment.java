package com.github.covid.vaccine.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date date;
    @OneToOne
    @JoinColumn(name = "patients_id")
    private Patient patient;
    @OneToOne
    @JoinColumn(name = "distributor_id")
    private VaccineDistributor distributor;

    public Appointment() {
    }

    public Appointment(int id, Date date, Patient patient, VaccineDistributor distributor) {
        this.id = id;
        this.date = date;
        this.patient = patient;
        this.distributor = distributor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public VaccineDistributor getDistributor() {
        return distributor;
    }

    public void setDistributor(VaccineDistributor distributor) {
        this.distributor = distributor;
    }

    @Override
    public String toString() {
        return "Appointment [date=" + date + ", distributor=" + distributor + ", id=" + id + ", patient=" + patient
                + "]";
    }

    
}
