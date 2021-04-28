package com.github.covid.vaccine.model;

public class VaccineDistributor {
    private String distributorName; 
    private String location;
    
    public VaccineDistributor() {
    }

    public VaccineDistributor(String distributorName, String location) {
        this.distributorName = distributorName;
        this.location = location;
    }

    public String getDistributorName() {
        return distributorName;
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "VaccineDistributor [distributorName=" + distributorName + ", location=" + location + "]";
    } 
    
}
