package com.github.covid.vaccine.controller;

import java.util.ArrayList;
import java.util.List;

import com.github.covid.vaccine.model.Appointment;
import com.github.covid.vaccine.service.AppointmentService;

import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping("/appointments/modify")
    public void addPatientToAppt(@RequestBody Integer[] aptArray) {

        int patientId = aptArray[0];
        int aptId = aptArray[1];

        Appointment apt = aService.updateAppointment(patientId, aptId);
        System.out.println(
            "━━━━━━ Patient "
            + apt.getPatient().getFname()
            + " claimed an appointment on "
            + apt.getDate()
            + ". ━━━━━━"
        );
    }

    @GetMapping("/appointments/distributor/{id}")
    public List<Appointment> findAppointmentsByDistributor(@PathVariable int id) {
        List<Appointment> tempApp = aService.getAppointments();
        List<Appointment> tempApp2 = new ArrayList<>();

        for (Appointment app : tempApp) {
            if (app.getDistributor().getDistributorId() == id) {
                tempApp2.add(app);
            }
        }

        return tempApp2;
    }

    @GetMapping("/appointments/patient/{id}")
    public List<Appointment> findAppointmentsByPatient(@PathVariable int id) {
        List<Appointment> tempApp = aService.getAppointments();
        List<Appointment> tempApp2 = new ArrayList<>();

        for (Appointment app : tempApp) {
            if (app.getPatient() != null) {
                if (app.getPatient().getId() == id) {
                    tempApp2.add(app);
                }
            }

        }

        return tempApp2;
    }

    @GetMapping("/appointments/zipcode/{id}")
    public List<Appointment> findAppointmentsByZipcode(@PathVariable int id) {
        List<Appointment> tempApp = aService.getAppointments();
        List<Appointment> tempApp2 = new ArrayList<>();

        for (Appointment app : tempApp) {
            if (app.getDistributor().getZipcode() == id && app.getPatient() == null) {
                tempApp2.add(app);
            }
        }

        return tempApp2;
    }

    @DeleteMapping("/deleteAppointment/{id}")
    public String delete(@PathVariable int id) {
        return aService.cancelAppointment(id);
    }

    @PostMapping("/appointments/cancel")
    public void cancelAppointment(@RequestBody Integer[] aptArray) {

        int id = aptArray[0];

        System.out.println("ENTERED CANCEL APPOINTMENT METHOD");

        Appointment apt = aService.removePatientFromAppt(id);
        System.out.println(
            "The appointment is now" + apt
        );
    }
}
