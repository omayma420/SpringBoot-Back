package com.example.demo.service.controller;


import com.example.demo.persistance.entities.Consultation;
import com.example.demo.persistance.entities.Consultation;
import com.example.demo.service.impliments.ConsultationService;
import com.example.demo.service.interfaces.IConsultation;

import com.example.demo.service.interfaces.IConsultation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/consultations")
public class ConsultationController {

    @Autowired
    IConsultation consultationservice;

    @RequestMapping(method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    Consultation save(@RequestBody Consultation consultation) {
        System.out.println("*******save ***********");
        Consultation c=consultationservice.saveConsultation(consultation);
        return c ;
    }

    @GetMapping("/{id}")
    Consultation getConsultationById(@PathVariable Long id) {
        return consultationservice.getConsultation(id);
    }

    @GetMapping("/quantity")
    int getQuantityConsultation() {
        return consultationservice.getQuantityOfConsultation();
    }

  /*  @GetMapping("/consultationByDate/{dateCons}")
    Consultation getConsultationByDate(@PathVariable LocalDateTime dateCons) {
        return consultationservice.findConsultationByDate(dateCons);
    }
*/
    @DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id) {
        consultationservice.deleteConsultation(id);
        return true;
    }

}
