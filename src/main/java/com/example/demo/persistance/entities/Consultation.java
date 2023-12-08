package com.example.demo.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Consultation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateCons;
    private String recapCons;
    @OneToOne
    private Rendezvous rdv;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getDateCons() {
		return dateCons;
	}
	public void setDateCons(LocalDateTime dateCons) {
		this.dateCons = dateCons;
	}
	public String getRecapCons() {
		return recapCons;
	}
	public void setRecapCons(String recapCons) {
		this.recapCons = recapCons;
	}
	public Rendezvous getRdv() {
		return rdv;
	}
	public void setRdv(Rendezvous rdv) {
		this.rdv = rdv;
	}
}