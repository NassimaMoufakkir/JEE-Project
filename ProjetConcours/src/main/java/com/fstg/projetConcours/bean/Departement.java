package com.fstg.projetConcours.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Departement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nom;
	private String description;
	@OneToMany(mappedBy = "departement")
	private List<Filiere> filieres;

	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Departement(Long id, String nom, String description, List<Filiere> filieres) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.filieres = filieres;
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Filiere> getFilieres() {
		return filieres;
	}

	public void setFilieres(List<Filiere> filieres) {
		this.filieres = filieres;
	}

}
