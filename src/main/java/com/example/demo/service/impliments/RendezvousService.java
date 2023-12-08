package com.example.demo.service.impliments;

import com.example.demo.persistance.dao.RendezvousRepository;
import com.example.demo.persistance.entities.Patient;
import com.example.demo.persistance.entities.Rendezvous;
import com.example.demo.persistance.entities.Rendezvous;
import com.example.demo.service.interfaces.IRendezvous;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.persistance.dao.RendezvousRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RendezvousService implements IRendezvous {


    @Autowired
    RendezvousRepository rendezvousrepository;
    @Override
    public Rendezvous saveRendezvous(Rendezvous rendezvous) {
        // TODO Auto-generated method stub
        return rendezvousrepository.save(rendezvous);
    }

    @Override
    public Patient findSpecilityBySpecialityName(String specialityName) {
        return null;
    }

    @Override
    public boolean deleteRendezvous(Long id) {
        // TODO Auto-generated method stub
        rendezvousrepository.deleteById(id);
        return true;
    }
    @Override
    public Rendezvous getRendezvous(Long id) {
        // TODO Auto-generated method stub
        return  rendezvousrepository.findById(id).get();
    }
    @Override
    public int getQuantityOfRendezvous() {
        // TODO Auto-generated method stub
        return  rendezvousrepository.getQuantityOfRendezvous();
    }

}