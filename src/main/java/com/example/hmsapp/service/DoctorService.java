package com.example.hmsapp.service;

import com.example.hmsapp.model.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    public List<Doctor> getAllDoctors() {

        try {
            System.out.println("Inside the Doctor Service Layer...");
            return List.of(new Doctor());
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
            return null;
        }
    }

    public Doctor getDoctor(Long id) {
        System.out.println("Inside the Doctor Service Layer...");
        return null;
    }

    public Doctor createDoctor(Doctor doctor) {
        System.out.println("Creating Doctor ->> Inside the Doctor Service Layer...");
        return doctor;
    }

    public void deleteDoctor(Long id) {
        System.out.println("Deleting Doctor by id -->> Inside the Doctor Service Layer...");
    }

    public void updateDoctor(Long id) {
        System.out.println("Updated Doctor ->> Inside the Doctor Service Layer...");
    }
}
