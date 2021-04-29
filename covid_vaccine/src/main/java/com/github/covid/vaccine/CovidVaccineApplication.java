package com.github.covid.vaccine;

import java.util.Date;

import com.github.covid.vaccine.model.Appointment;
import com.github.covid.vaccine.model.Patient;
import com.github.covid.vaccine.model.VaccineDistributor;
import com.github.covid.vaccine.repository.AppointmentsRepository;
import com.github.covid.vaccine.repository.PatientRepository;
import com.github.covid.vaccine.repository.VaccineDistributorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CovidVaccineApplication implements CommandLineRunner{

	@Autowired
    private PatientRepository patientRepository;

    @Autowired
    private VaccineDistributorRepository vRepository;

	@Autowired
	private AppointmentsRepository aRepository;


	public static void main(String[] args) {
		SpringApplication.run(CovidVaccineApplication.class, args);
	}

	@Override
    public void run(String... args){
		Date date = new Date();
        System.out.println("**In the run method**");
        Patient patient = new Patient(1,"Maurice", "Liddy", 30, "male", "admin", "passwd");
        this.patientRepository.save(patient);

        VaccineDistributor vacdist = new VaccineDistributor(1,"sdfsad", "dsfdf", "sdsds", "sdad", "sddf", 34521);
        this.vRepository.save(vacdist);

		Appointment appointment = new Appointment(1, date, patient, vacdist);
		this.aRepository.save(appointment);

        System.out.println("**Out of the  the run method**");
    }


}
