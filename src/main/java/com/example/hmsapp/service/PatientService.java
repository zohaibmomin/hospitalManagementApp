package com.example.hmsapp.service;

import com.example.hmsapp.model.Patient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class PatientService {
    public List<Patient> getAllPatients() {

        try {
            System.out.println("Inside the Patient Service Layer...");
            return List.of(new Patient());
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
            return null;
        }
    }

    public Patient getPatient(Long id) {
        System.out.println("Inside the Patient Service Layer...");
        return null;
    }

    public Patient createPatient(Patient patient) {
        System.out.println("Creating Patient ->> Inside the Patient Service Layer...");
        return patient;
    }

    public void deletePatient(Long id) {
        System.out.println("Deleting Patient by id -->> Inside the Patient Service Layer...");
    }

    public void updatePatient(Long id) {
        System.out.println("Updated Patient ->> Inside the Patient Service Layer...");
    }
}
