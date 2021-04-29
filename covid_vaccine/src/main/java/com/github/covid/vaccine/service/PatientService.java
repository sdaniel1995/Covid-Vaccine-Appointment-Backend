package com.github.covid.vaccine.service;

import java.util.List;

import com.github.covid.vaccine.model.Patient;
import com.github.covid.vaccine.repository.PatientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    private PatientRepository repository;

    public Patient insertPatient(Patient patient) {
       return repository.save(patient);
    }

    public List<Patient> insertPatients(List<Patient> patient) {
        return repository.saveAll(patient);
    }

    public List<Patient> getPatients() {
        return repository.findAll();
    }

    public Patient getPatientById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Patient getPatientByName(String firstName) {
        return repository.findByfname(firstName);
    }

    public String removePatient(int id) {
        repository.deleteById(id);
        return "Patient with ID: " + id + " has been removed";
    }
}
