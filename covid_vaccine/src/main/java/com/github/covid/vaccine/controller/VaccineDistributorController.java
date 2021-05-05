package com.github.covid.vaccine.controller;

import java.util.List;
import java.util.Optional;

import com.github.covid.vaccine.model.VaccineDistributor;
import com.github.covid.vaccine.service.VaccineDistributorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
public class VaccineDistributorController {
    @Autowired
    private VaccineDistributorService vService;

    @PostMapping("/addDistributor")
    public VaccineDistributor addDistributor(@RequestBody VaccineDistributor vDistributor) {
        return vService.insertDistributor(vDistributor);
    }

    @GetMapping("/distributors")
    public List<VaccineDistributor> findAllDistributors() {
        return vService.getDistributors();
    }

    @GetMapping("/distributor/{id}")
    public VaccineDistributor findDistributorById(@PathVariable int id) {
        return vService.getDistributorById(id);
    }

    @PostMapping("/distributorLogin")
    @ResponseBody
    public ResponseEntity<Optional<VaccineDistributor>> distibutorLogin(@RequestBody VaccineDistributor vDistributor) {
        Optional<VaccineDistributor> tempDistributor = vService.getDistributorByName(vDistributor.getDistributorName());
        System.out.println(tempDistributor.get().getDistributorId());

        if ((tempDistributor.get().getDistributorName().equals(vDistributor.getDistributorName()))
                && (tempDistributor.get().getPass().equals(vDistributor.getPass())))
            return new ResponseEntity<>(tempDistributor, HttpStatus.OK);

        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }
}
