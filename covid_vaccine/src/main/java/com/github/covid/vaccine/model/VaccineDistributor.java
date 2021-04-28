package com.github.covid.vaccine.model;

public class VaccineDistributor {
    private int id; 
    private String distributor; 
    private String location;
    
    public VaccineDistributor() {
    }

    public VaccineDistributor(int id, String distributor, String location) {
        this.id = id;
        this.distributor = distributor;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "VaccineDistributor [distributor=" + distributor + ", id=" + id + ", location=" + location + "]";
    }

    
}
