package com.example.demo.persistance.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Rendezvous implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateRDV;
    private LocalDateTime heureRDV;
    @ManyToOne
    private Patient patient;
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getDateRDV() {
		return dateRDV;
	}
	public void setDateRDV(LocalDateTime dateRDV) {
		this.dateRDV = dateRDV;
	}
	public LocalDateTime getHeureRDV() {
		return heureRDV;
	}
	public void setHeureRDV(LocalDateTime heureRDV) {
		this.heureRDV = heureRDV;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	@ManyToOne
    private Medecin medecin;
}