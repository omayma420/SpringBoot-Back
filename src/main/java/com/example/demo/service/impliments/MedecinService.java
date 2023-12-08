package com.example.demo.service.impliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.dao.MedecinRepository;
import com.example.demo.persistance.entities.Medecin;
import com.example.demo.service.interfaces.IMedecin;

@Service
public class MedecinService implements IMedecin{

	@Autowired
	MedecinRepository medecinRepository;
	
	@Override
	public Medecin saveMedecin(Medecin medecin) {
		// TODO Auto-generated method stub
		return medecinRepository.save(medecin);
	}

	@Override
	public Medecin updateMedecin(Medecin medecin) {
		// TODO Auto-generated method stub
		return medecinRepository.saveAndFlush(medecin);	
	}

	@Override
	public boolean deleteMedecin(Long id) {
		// TODO Auto-generated method stub
		medecinRepository.deleteById(id);
		return true;
	}

	@Override
	public List<Medecin> getListMedecin() {
		// TODO Auto-generated method stub
		return  medecinRepository.findAll();
	}
	@Override
	public Medecin getMedecin(Long id) {
		// TODO Auto-generated method stub
		return  medecinRepository.findById(id).get();

	}

	@Override
	public Medecin findMedecinByName(String name) {
		// TODO Auto-generated method stub
		return  medecinRepository.findByNom(name);
	}

	@Override
	public int getQuantityOfMedecin() {
		// TODO Auto-generated method stub
		return  medecinRepository.getQuantityOfMedecin();
	}

	@Override
	public Medecin getMedecinByIdMedecin(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


}
