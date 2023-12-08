package com.example.demo.persistance.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Speciality implements Serializable {
	
	    @Id 
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getSpecialityName() {
			return specialityName;
		}
		public void setSpecialityName(String specialityName) {
			this.specialityName = specialityName;
		}
		public List<Medecin> getMedecins() {
			return medecins;
		}
		public void setMedecins(List<Medecin> medecins) {
			this.medecins = medecins;
		}
		private String specialityName;
	    @OneToMany
	    private List<Medecin> medecins;

	

}
