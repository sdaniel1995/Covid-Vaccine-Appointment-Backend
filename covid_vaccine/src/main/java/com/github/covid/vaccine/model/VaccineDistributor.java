package com.github.covid.vaccine.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vaccineDistributor")
public class VaccineDistributor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer distributorId;

    @Column(name = "distributor", nullable = false)
    private String distributorName;

    @Column(name = "password", nullable = false)
    private String pass;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String countryState;

    @Column(nullable = false)
    private Integer zipcode;

    public VaccineDistributor() {
    }

    public VaccineDistributor(String distributorName, String pass, String address, String city, String countryState,
            int zipcode) {
        this.distributorName = distributorName;
        this.pass = pass;
        this.address = address;
        this.city = city;
        this.countryState = countryState;
        this.zipcode = zipcode;
    }

    public Integer getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(Integer distributorId) {
        this.distributorId = distributorId;
    }

    public String getDistributorName() {
        return distributorName;
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryState() {
        return countryState;
    }

    public void setCountryState(String countryState) {
        this.countryState = countryState;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "VaccineDistributor [city=" + city + ", countryState=" + countryState + ", distributor_id="
                + distributorId + ", distributor_name=" + distributorName + ", location_address=" + address + ", pass="
                + pass + ", zipcode=" + zipcode + "]";
    }

}
