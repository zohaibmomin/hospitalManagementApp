package com.example.hmsapp.controller;

import com.example.hmsapp.model.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    @GetMapping
    public List<Patient> getAllPatients(){
        System.out.println("Fetching all Patients");
        return List.of(new Patient());
    }

    @GetMapping("/{id}")
    public Patient getPatient(@PathVariable Long id){
        System.out.println("Fetch Patient");
        return null;
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient){
        System.out.println("Creating Patient");
        return patient;
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id){
        System.out.println("Deleting Patient by id");
    }

    @PutMapping("/{id}")
    public void updatePatient(@PathVariable Long id){
        System.out.println("Updated Patient");
    }

}
