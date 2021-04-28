package com.github.covid.vaccine.model;

import java.sql.Date;

public class Appointment {

    private int id;
    private Date date;
    private Patient patient;
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
