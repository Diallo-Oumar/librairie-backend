package com.api.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity


public class Utulisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String nom;
	private String prenom;
	private String telephone;
	private String email;
	private Date date_creation;
	private String adresse_location;
	private Boolean isclient;
	
	@ManyToOne
	@JoinColumn(name = "Id_librairie")
	private Librairie librairie;
	@OneToMany(mappedBy = "utulisateur")
	private List<Clientele> ListesClientele;
	@OneToMany(mappedBy = "utulisateur")
	private List<Emprunt> ListesEmprunt;
	@OneToMany(mappedBy = "utulisateur")
	private List<Achat> ListesAchat;
	
	
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
	public Librairie getLibrairie() {
		return librairie;
	}
	public void setLibrairie(Librairie librairie) {
		this.librairie = librairie;
	}
	public List<Clientele> getListesClientele() {
		return ListesClientele;
	}
	public void setListesClientele(List<Clientele> listesClientele) {
		ListesClientele = listesClientele;
	}
	public List<Emprunt> getListesEmprunt() {
		return ListesEmprunt;
	}
	public void setListesEmprunt(List<Emprunt> listesEmprunt) {
		ListesEmprunt = listesEmprunt;
	}
	public List<Achat> getListesAchat() {
		return ListesAchat;
	}
	public void setListesAchat(List<Achat> listesAchat) {
		ListesAchat = listesAchat;
	}
	
	
	
	


	
	
	
}
