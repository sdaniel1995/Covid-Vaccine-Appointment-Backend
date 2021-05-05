package com.github.covid.vaccine.repository;


import java.util.Optional;

import com.github.covid.vaccine.model.Appointment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AppointmentsRepository extends JpaRepository<Appointment,Integer> {
    //public Optional<Appointment> findById(Integer id);
}
