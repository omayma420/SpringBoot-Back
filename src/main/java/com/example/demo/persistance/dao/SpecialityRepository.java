package com.example.demo.persistance.dao;

import com.example.demo.persistance.entities.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.persistance.entities.Speciality;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SpecialityRepository extends JpaRepository<Speciality, Long>{
    

    @Query(value = "select count(*) from speciality",nativeQuery = true)
    int getQuantityOfSpeciality();
    @Query(value = "select * from speciality where id= :id",nativeQuery = true)
    Speciality getSpecialityById(@Param("id") Long id);


    Speciality findBySpecialityName(String specialityName);
}
