package com.github.covid.vaccine.model;

public class Appointment {

    private int id; 
    private int patient_id; 
    private int vaccineDistributor_id;
    private String timeDate;

    public Appointment() {
    }

    public Appointment(int id, int patient, int vaccineDistributor, String timeDate) {
        this.id = id;
        this.patient_id = patient;
        this.vaccineDistributor_id = vaccineDistributor;
        this.timeDate = timeDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatient() {
        return patient_id;
    }

    public void setPatient(int patient) {
        this.patient_id = patient;
    }

    public int getVaccineDistributor() {
        return vaccineDistributor_id;
    }

    public void setVaccineDistributor(int vaccineDistributor) {
        this.vaccineDistributor_id = vaccineDistributor;
    }

    public String getTimeDate() {
        return timeDate;
    }

    public void setTimeDate(String timeDate) {
        this.timeDate = timeDate;
    }

    @Override
    public String toString() {
        return "Appointment [id=" + id + ", patient_id=" + patient_id + ", timeDate=" + timeDate
                + ", vaccineDistributor_id=" + vaccineDistributor_id + "]";
    }

}
