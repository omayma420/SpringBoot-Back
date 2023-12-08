package com.example.demo.persistance.entities;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Medecin implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;
    @OneToMany(mappedBy = "medecin")
    private List<Rendezvous> Listrdv;
    
    @ManyToOne
    private Speciality specialitie;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Rendezvous> getListrdv() {
		return Listrdv;
	}

	public void setListrdv(List<Rendezvous> listrdv) {
		Listrdv = listrdv;
	}

	public Speciality getSpecialitie() {
		return specialitie;
	}

	public void setSpecialitie(Speciality specialitie) {
		this.specialitie = specialitie;
	}
  
}