package com.github.covid.vaccine.service;

import java.util.List;

import com.github.covid.vaccine.model.Patient;
import com.github.covid.vaccine.repository.PatientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    private PatientRepository pRepository;

    public Patient insertPatient(Patient patient) {
       return pRepository.save(patient);
    }

    public List<Patient> insertPatients(List<Patient> patients) {
        return pRepository.saveAll(patients);
    }

    public List<Patient> getPatients() {
        return pRepository.findAll();
    }

    public Patient getPatientById(int id) {
        return pRepository.findById(id).orElse(null);
    }

    public String removePatient(int id) {
        pRepository.deleteById(id);
        return "Patient with ID: " + id + " has been removed";
    }
}
