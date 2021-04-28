package com.github.covid.vaccine.model;

public class Patient {

    private int id; 
    private String fname; 
    private String lname;
    private int age;
    private String sex; 
    private String username; 
    private String pass;
    
    public Patient() {
    }

    public Patient(int id, String fname, String lname, int age, String sex, String username, String pass) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.sex = sex;
        this.username = username;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Patient [age=" + age + ", fname=" + fname + ", id=" + id + ", lname=" + lname + ", pass=" + pass
                + ", sex=" + sex + ", username=" + username + "]";
    }

    
}