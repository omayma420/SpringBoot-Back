package com.example.demo.service.interfaces;

import com.example.demo.persistance.entities.Consultation;

import java.time.LocalDateTime;

public interface IConsultation {
 //   Consultation findConsultationByDate(LocalDateTime dateCons);

    void deleteConsultation(Long id);

    int getQuantityOfConsultation();

    Consultation getConsultation(Long id);

    Consultation saveConsultation(Consultation consultation);
}
