package com.app_jour_j.mvc.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Participant implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(nullable = false, unique = true)
	private Long idEtudiant;
	private String nom;
	private String prenom;
	private String statut; // etudiant ou autre
	private String etablissement;
	private Long numeroTelephone;
	private String email;
	private String workshopSelectionne;
	private String defaultLogo;

	public Participant() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdEtudiant() {
		return idEtudiant;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getStatut() {
		return statut;
	}

	public String getEtablissement() {
		return etablissement;
	}

	public Long getNumeroTelephone() {
		return numeroTelephone;
	}

	public String getEmail() {
		return email;
	}

	public String getWorkshopSelectionne() {
		return workshopSelectionne;
	}

	public void setIdEtudiant(Long idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}

	public void setNumeroTelephone(Long numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setWorkshopSelectionne(String workshopSelectionne) {
		this.workshopSelectionne = workshopSelectionne;
	}

	public String getDefaultLogo() {
		return defaultLogo;
	}

	public void setDefaultLogo(String defaultLogo) {
		this.defaultLogo = defaultLogo;
	}

}
