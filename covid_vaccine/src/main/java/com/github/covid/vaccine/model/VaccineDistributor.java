package com.github.covid.vaccine.model;

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
    private int distributor_id;
    private String distributor_name;
    private String pass;
    private String location_address;
    private String city;
    private String countryState;
    private int zipcode;

    public VaccineDistributor() {
    }

    public VaccineDistributor(int distributor_id, String distributor_name, String pass, String location_address,
            String city, String countryState, int zipcode) {
        this.distributor_id = distributor_id;
        this.distributor_name = distributor_name;
        this.pass = pass;
        this.location_address = location_address;
        this.city = city;
        this.countryState = countryState;
        this.zipcode = zipcode;
    }

    public int getDistributor_id() {
        return distributor_id;
    }

    public void setDistributor_id(int distributor_id) {
        this.distributor_id = distributor_id;
    }

    public String getDistributor_name() {
        return distributor_name;
    }

    public void setDistributor_name(String distributor_name) {
        this.distributor_name = distributor_name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getLocation_address() {
        return location_address;
    }

    public void setLocation_address(String location_address) {
        this.location_address = location_address;
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
                + distributor_id + ", distributor_name=" + distributor_name + ", location_address=" + location_address
                + ", pass=" + pass + ", zipcode=" + zipcode + "]";
    }

}
