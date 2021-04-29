package com.github.covid.vaccine.model;

import java.sql.Date;

import javax.persistence.Column;
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
    private Integer id;

    @Column(nullable = false)
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((distributor == null) ? 0 : distributor.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((patient == null) ? 0 : patient.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Appointment other = (Appointment) obj;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        if (distributor == null) {
            if (other.distributor != null)
                return false;
        } else if (!distributor.equals(other.distributor))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (patient == null) {
            if (other.patient != null)
                return false;
        } else if (!patient.equals(other.patient))
            return false;
        return true;
    }

    
}
