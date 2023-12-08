package com.example.demo.service.impliments;

import com.example.demo.persistance.dao.ConsultationRepository;
import com.example.demo.persistance.entities.Consultation;
import com.example.demo.service.interfaces.IConsultation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ConsultationService implements IConsultation {

    @Autowired
    ConsultationRepository consultationRepository;

/*    @Override
    public Consultation findConsultationByDate(LocalDateTime dateCons) {
        // TODO Auto-generated method stub
        return  consultationRepository.findByDate(dateCons);
    }*/

    @Override
    public void deleteConsultation(Long id) {
        // TODO Auto-generated method stub
        consultationRepository.deleteById(id);
    }

    @Override
    public int getQuantityOfConsultation() {
        // TODO Auto-generated method stub
        return  consultationRepository.getQuantityOfConsultation();    }

    @Override
    public Consultation getConsultation(Long id) {
        // TODO Auto-generated method stub
        return  consultationRepository.findById(id).get();    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        // TODO Auto-generated method stub
        return consultationRepository.save(consultation);
    }

}
