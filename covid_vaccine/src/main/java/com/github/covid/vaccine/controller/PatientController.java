package com.github.covid.vaccine.controller;

import java.util.List;

import com.github.covid.vaccine.model.Patient;
import com.github.covid.vaccine.service.PatientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
    @Autowired
    private PatientService service;

    @PostMapping("/addPatient")
    public Patient addPatient(@RequestBody Patient patient) {
        return service.insertPatient(patient);
    }

    @PostMapping("/addPatients")
    public List<Patient> addPatients(@RequestBody List<Patient> patient) {
        return service.insertPatients(patient);
    }

    @GetMapping("/patients")
    public List<Patient> findAllPatients() {
        return service.getPatients();
    }

    @GetMapping("/patient/{id}")
    public Patient findPatientById(@PathVariable int id) {
        return service.getPatientById(id);
    }

    @GetMapping("/patient/{name}")
    public Patient findPatientByName(@PathVariable String name) {
        return service.getPatientByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return service.removePatient(id);
    }
}
