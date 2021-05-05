package com.github.covid.vaccine.repository;


import java.util.Optional;

import com.github.covid.vaccine.model.Patient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer>{
    public Optional<Patient> findByUsername(String username);
}
