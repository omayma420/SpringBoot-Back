package com.example.demo.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.persistance.entities.Medecin;
import com.example.demo.persistance.entities.Patient;
import com.example.demo.service.interfaces.IMedecin;
import com.example.demo.service.interfaces.IPatient;

@RestController
@RequestMapping("/api/medecin")
public class MedecinController {

	@Autowired
	IMedecin medecinservice;
	
	@RequestMapping(method = RequestMethod.POST, consumes="application/json", produces = "application/json")
	Medecin save(@RequestBody Medecin medecin) {	
		  System.out.println("*******save ***********");
		  Medecin m=medecinservice.saveMedecin(medecin);
		  System.out.println("*******"+m.getEmail());
        return m ;
    }
	
	
	@GetMapping("/{id}")
	Medecin getMedecinById(@PathVariable Long id) {
        return medecinservice.getMedecin(id);
    }
	
	@GetMapping("/quantity")
    int getQuantityMedecin() {
        return medecinservice.getQuantityOfMedecin();
    }
	
	@GetMapping("/medecinByName/{name}")
	Medecin getMedecinByName(@PathVariable String name) {
        return medecinservice.findMedecinByName(name);
    }
	
	@DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id) {
		medecinservice.deleteMedecin(id);
        return true;
    }
	
	
}
