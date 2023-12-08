package com.example.demo.persistance.dao;

import com.example.demo.persistance.entities.Rendezvous;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.persistance.entities.Rendezvous;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RendezvousRepository extends JpaRepository<Rendezvous, Long>{

    @Query(value = "select count(*) from rendezvous",nativeQuery = true)
    int getQuantityOfRendezvous();
    @Query(value = "select * from rendezvous where id= :id",nativeQuery = true)
    Rendezvous getRendezvousByIdRendezvous(@Param("id") Long id);

}
