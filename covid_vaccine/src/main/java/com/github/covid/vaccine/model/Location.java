package com.github.covid.vaccine.model;

public class Location {
    private int id; 
    private int streetNumber; 
    private String streetName; 
    private String city; 
    private String state; 
    private int zipCode;
    
    public Location() {
    }

    public Location(int id, int streetNumber, String streetName, String city, String state, int zipCode) {
        this.id = id;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Location [city=" + city + ", id=" + id + ", state=" + state + ", streetName=" + streetName
                + ", streetNumber=" + streetNumber + ", zipCode=" + zipCode + "]";
    } 

}
