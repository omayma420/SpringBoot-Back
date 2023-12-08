package com.example.demo.service.controller;

import java.util.List;
import java.util.Optional;

import org.apache.el.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.persistance.entities.Patient;
import com.example.demo.service.interfaces.IPatient;

import lombok.AllArgsConstructor;

@CrossOrigin(origins = "http://localhost:4200")

@AllArgsConstructor
@RestController
@RequestMapping("/api/patient")
public class PatientController {

	@Autowired
	IPatient patientservice;
	
	@RequestMapping(method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    Patient save(@RequestBody Patient patient) {	
		  System.out.println("*******save ***********");
		  Patient p=patientservice.savePatient(patient);
		  System.out.println("*******"+p.getEmail());
        return p ;
    }
	
	
	@GetMapping("/{id}")
    Patient getPatientById(@PathVariable Long id) {
        return patientservice.getPatient(id);
    }
	
	@GetMapping("/quantity")
    int getQuantityPatient() {
        return patientservice.getQuantityOfPatient();
    }
	
	@GetMapping("/patientByName/{name}")
    Patient getPatientByName(@PathVariable String name) {
        return patientservice.findPatientByName(name);
    }
	
	@DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id) {
        patientservice.deletePatient(id);
        return true;
    }
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	List<Patient> getAllPatients() {
	    return patientservice.getAllPatients();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updatePatient(@PathVariable Long id, @RequestBody Patient updatedPatient) {
	    System.out.println("******update **********");

	    // Retrieve the existing patient by ID
	    Optional<Patient> existingPatientOptional = patientservice.getPatientById(id);

	    if (existingPatientOptional.isPresent()) {
	        Patient existingPatient = existingPatientOptional.get();

	        // Update the necessary fields
	        existingPatient.setNom(updatedPatient.getNom());
	        existingPatient.setEmail(updatedPatient.getEmail());

	        // Save the updated patient
	        Patient updatedPatientResult = patientservice.updatePatient(existingPatient);

	        // Return the updated patient in the response
	        return ResponseEntity.ok(updatedPatientResult);
	    } else {
	        // Patient not found, return 404
	        return ResponseEntity.notFound().build();
	    }
	}




}

	
	

