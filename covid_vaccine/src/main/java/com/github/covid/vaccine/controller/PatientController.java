package com.github.covid.vaccine.controller;

import java.util.List;
import java.util.Optional;

import com.github.covid.vaccine.model.Patient;
import com.github.covid.vaccine.service.PatientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class PatientController {
    @Autowired
    private PatientService pService;

    @PostMapping("/addPatient")
    public Patient addPatient(@RequestBody Patient patient) {
        return pService.insertPatient(patient);
    }

    @PostMapping("/addPatients")
    public List<Patient> addPatients(@RequestBody List<Patient> patients) {
        return pService.insertPatients(patients);
    }

    @GetMapping("/patients")
    public List<Patient> findAllPatients() {
        return pService.getPatients();
    }

    @GetMapping("/patient/{id}")
    public Patient findPatientById(@PathVariable int id) {
        return pService.getPatientById(id);
    }

    @DeleteMapping("/deletePatient/{id}")
    public String delete(@PathVariable int id) {
        return pService.removePatient(id);
    }

    @PostMapping("/patientLogin")
    @ResponseBody
    public ResponseEntity<Optional<Patient>> patientLogin(@RequestBody Patient patient) {
        Optional<Patient> tempPatient = pService.getPatientByUsername(patient.getUsername());

        if ((tempPatient.get().getUsername().equals(patient.getUsername()))
                && (tempPatient.get().getPass().equals(patient.getPass()))) {
            System.out.println("━━━━━━ Patient " + patient.getUsername() + " logged in. ━━━━━━");
            return new ResponseEntity<>(tempPatient, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }
}
