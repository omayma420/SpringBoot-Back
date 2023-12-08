package com.example.demo.service.interfaces;

import com.example.demo.persistance.entities.Patient;
import com.example.demo.persistance.entities.Rendezvous;

public interface IRendezvous {
    boolean deleteRendezvous(Long id);

    int getQuantityOfRendezvous();

    Rendezvous getRendezvous(Long id);

    Rendezvous saveRendezvous(Rendezvous rendezvous);

    Patient findSpecilityBySpecialityName(String specialityName);
}
