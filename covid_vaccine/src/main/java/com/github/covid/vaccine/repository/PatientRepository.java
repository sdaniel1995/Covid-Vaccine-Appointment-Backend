package com.github.covid.vaccine.repository;


import com.github.covid.vaccine.model.Patient;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Integer>{
    Patient findByFirstName(String firstName);
}
