package com.app_jour_j.mvc.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Media implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(nullable = false, unique = true)
	private Long idMedia;
	private String nom;
	private String prenom;
	private String statut;
	private String chaine;
	private String email;
	private String logoChaine;

	public Media() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdMedia() {
		return idMedia;
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

	public String getChaine() {
		return chaine;
	}

	public String getEmail() {
		return email;
	}

	public String getLogoChaine() {
		return logoChaine;
	}

	public void setIdMedia(Long idMedia) {
		this.idMedia = idMedia;
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

	public void setChaine(String chaine) {
		this.chaine = chaine;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setLogoChaine(String logoChaine) {
		this.logoChaine = logoChaine;
	}

}