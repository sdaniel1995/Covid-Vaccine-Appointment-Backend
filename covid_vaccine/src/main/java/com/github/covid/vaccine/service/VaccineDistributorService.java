package com.github.covid.vaccine.service;

import com.github.covid.vaccine.repository.VaccineDistributorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccineDistributorService {
    @Autowired
    private VaccineDistributorRepository vRepository;
}
