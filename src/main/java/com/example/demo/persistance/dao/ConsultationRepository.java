package com.example.demo.persistance.dao;

import com.example.demo.persistance.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.persistance.entities.Consultation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {

   // Consultation findByDate(LocalDateTime dateCons);

    @Query(value = "select count(*) from consultation",nativeQuery = true)
    int getQuantityOfConsultation();
    @Query(value = "select * from consultation where id= :id",nativeQuery = true)
    Consultation getConsultationByIdConsultation(@Param("id") Long id);
}
