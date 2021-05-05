package com.github.covid.vaccine.controller;

import java.util.List;

import com.github.covid.vaccine.model.Appointment;
import com.github.covid.vaccine.model.Patient;
import com.github.covid.vaccine.service.AppointmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class AppointmentController {
    @Autowired
    private AppointmentService aService;

    @PostMapping("/createAppointment")
    public Appointment newAppointment(@RequestBody Appointment appointment) {
        return aService.createAppointment(appointment);
    }

    @PostMapping("/createAppointments")
    @ResponseBody
    public List<Appointment> newAppointments(@RequestBody List<Appointment> appointments) {
        return aService.createAppointments(appointments);
    }

    @GetMapping("/appointments")
    public List<Appointment> findAllAppointments() {
        return aService.getAppointments();
    }

    @DeleteMapping("/deleteAppointment/{id}")
    public String delete(@PathVariable int id) {
        return aService.cancelAppointment(id);
    }

    /*@PutMapping("/updateAppointment")
    public Appointment update(@RequestBody Appointment appointment, @RequestBody Patient patient) {
        Appointment tempAppointment = aService.findById(appointment.getId());
        return null;
    }*/
}
