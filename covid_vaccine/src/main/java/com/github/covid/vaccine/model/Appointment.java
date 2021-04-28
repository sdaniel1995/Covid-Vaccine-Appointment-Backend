package com.github.covid.vaccine.model;

import java.sql.Date;

public class Appointment {
    private int patient; 
    private int vaccineDistributor;
    private String timeDate;

    public Appointment() {
    }

    public Appointment(int patient, int vaccineDistributor, String timeDate) {
        this.patient = patient;
        this.vaccineDistributor = vaccineDistributor;
        this.timeDate = timeDate;
    }

    public int getPatient() {
        return patient;
    }

    public void setPatient(int patient) {
        this.patient = patient;
    }

    public int getVaccineDistributor() {
        return vaccineDistributor;
    }

    public void setVaccineDistributor(int vaccineDistributor) {
        this.vaccineDistributor = vaccineDistributor;
    }

    public String getTimeDate() {
        return timeDate;
    }

    public void setTimeDate(String timeDate) {
        this.timeDate = timeDate;
    }

    @Override
    public String toString() {
        return "Appointment [patient=" + patient + ", timeDate=" + timeDate + ", vaccineDistributor="
                + vaccineDistributor + "]";
    } 
}
