package com.github.covid.vaccine.service;

import java.util.List;
import java.util.Optional;

import com.github.covid.vaccine.model.VaccineDistributor;
import com.github.covid.vaccine.repository.VaccineDistributorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccineDistributorService {
    @Autowired
    private VaccineDistributorRepository vRepository;

    public VaccineDistributor insertDistributor(VaccineDistributor vDistributor) {
        return vRepository.save(vDistributor);
    }

    public List<VaccineDistributor> getDistributors() {
        return vRepository.findAll();
    }

    public VaccineDistributor getDistributorById(int id) {
        return vRepository.findById(id).orElse(null);
    }

    public Optional<VaccineDistributor> getDistributorByName(String name) {
        return vRepository.findByDistributorName(name);
    }
}
