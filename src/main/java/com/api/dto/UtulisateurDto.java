package com.api.dto;

import java.util.Date;

public class UtulisateurDto {
	private int Id;
	private String nom;
	private String prenom;
	private String telephone;
	private String email;
	private Date date_creation;
	private String adresse_location;
	private Boolean isclient;
	private int Id_librairie;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public String getAdresse_location() {
		return adresse_location;
	}
	public void setAdresse_location(String adresse_location) {
		this.adresse_location = adresse_location;
	}
	public Boolean getIsclient() {
		return isclient;
	}
	public void setIsclient(Boolean isclient) {
		this.isclient = isclient;
	}
	public int getId_librairie() {
		return Id_librairie;
	}
	public void setId_librairie(int id_librairie) {
		Id_librairie = id_librairie;
	}
	
	
	
	
}
