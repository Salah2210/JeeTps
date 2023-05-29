package com.example.tp4_jee;

import com.example.tp4_jee.dao.PatientRepository;
import com.example.tp4_jee.entities.Patient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Tp4JeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp4JeeApplication.class, args);
    }
    //@Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository)
    {
        return args -> {
            patientRepository.save(
                    new Patient(null,"Hassan",new Date(),false,122));
            patientRepository.save(
                    new Patient(null,"Kawtar",new Date(),true,321));
            patientRepository.save(
                    new Patient(null,"Lamiaa",new Date(),false,165));
            patientRepository.save(
                    new Patient(null,"Ali",new Date(),true,132));

            patientRepository.findAll().forEach(p-> {
                System.out.println(p.getNom());

            });
        };
    }
}
