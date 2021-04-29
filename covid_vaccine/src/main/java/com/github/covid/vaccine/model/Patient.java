package com.github.covid.vaccine.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; 

    @Column(nullable = false)
    private String fname; 

    @Column(nullable = false)
    private String lname;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false)
    private String sex; 

    @Column(nullable = false)
    private String username; 

    @Column(nullable = false)
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