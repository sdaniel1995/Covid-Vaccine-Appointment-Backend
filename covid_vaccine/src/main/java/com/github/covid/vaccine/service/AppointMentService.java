package com.github.covid.vaccine.service;

import java.util.List;

import com.github.covid.vaccine.model.Appointment;
import com.github.covid.vaccine.repository.AppointmentsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentsRepository aRepository;

    public Appointment creatAppointment(Appointment appointment) {
        return aRepository.save(appointment);
    }

    public List<Appointment> createAppointments(List<Appointment> appointments) {
        return aRepository.saveAll(appointments);
    }

    public List<Appointment> getAppointments() {
        return aRepository.findAll();
    }

    public String cancelAppointment(int id) {
        aRepository.deleteById(id);
        return "Appoint with ID: " + id + " has been removed";
    }
}
