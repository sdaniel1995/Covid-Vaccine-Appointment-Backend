package com.github.covid.vaccine.repository;

import com.github.covid.vaccine.model.VaccineDistributor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccineDistributorRepository extends JpaRepository<VaccineDistributor,Integer> {  
}
