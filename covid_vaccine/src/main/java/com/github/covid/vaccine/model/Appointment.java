package com.github.covid.vaccine.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

     @JsonFormat(pattern = "HH:mm")
     private LocalTime time;

    @OneToOne
    @JoinColumn(name = "patient_id",nullable = true)
    private Patient patient;
    
    @OneToOne
    @JoinColumn(name = "distributor_id",nullable = true)
    private VaccineDistributor distributor;

    public Appointment() {
    }

    

    public Appointment(Integer id, LocalDate date, LocalTime time, Patient patient, VaccineDistributor distributor) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.patient = patient;
        this.distributor = distributor;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

   
    public LocalDate getDate() {
        return date;
    }



    public void setDate(LocalDate date) {
        this.date = date;
    }



    public LocalTime getTime() {
        return time;
    }



    public void setTime(LocalTime time) {
        this.time = time;
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
                + ", time=" + time + "]";
    }

  
}
