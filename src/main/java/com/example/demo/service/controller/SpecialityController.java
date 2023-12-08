package com.example.demo.service.controller;

import com.example.demo.persistance.entities.Patient;
import com.example.demo.persistance.entities.Speciality;
import com.example.demo.service.impliments.SpecialityService;
import com.example.demo.service.interfaces.ISpeciality;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/specialites")
public class SpecialityController {

    @Autowired
    ISpeciality specialityservice;

    @RequestMapping(method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    Speciality save(@RequestBody Speciality speciality) {
        System.out.println("*******save ***********");
        Speciality p=specialityservice.saveSpeciality(speciality);
       // System.out.println("*******"+p.getEmail());
        return p ;
    }

    @GetMapping("/{id}")
    Speciality getSpecialityById(@PathVariable Long id) {
        return specialityservice.getSpeciality(id);
    }

    @GetMapping("/quantity")
    int getQuantitySpeciality() {
        return specialityservice.getQuantityOfSpeciality();
    }
    @GetMapping("/specialityByName/{specialityName}")
    Speciality getSpecialityBy(@PathVariable String specialityName) {

        return specialityservice.findSpecialityBySpecialityName(specialityName);
    }


    @DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id) {
        specialityservice.deleteSpeciality(id);
        return true;
    }
    
}