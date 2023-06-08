package com.api.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Librairie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String nom;
	private String slogan;
	private String emplacement;
	

	@OneToMany(mappedBy = "librairie")
	private List<Utulisateur> ListesUtulisateur;
	@OneToMany(mappedBy = "librairie")
	private List<Clientele> ListesClientele;
	@OneToMany(mappedBy = "librairie")
	private List<Livre> ListesLivre;
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
	public String getSlogan() {
		return slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	public String getEmplacement() {
		return emplacement;
	}
	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}
	public List<Utulisateur> getListesUtulisateur() {
		return ListesUtulisateur;
	}
	public void setListesUtulisateur(List<Utulisateur> listesUtulisateur) {
		ListesUtulisateur = listesUtulisateur;
	}
	public List<Clientele> getListesClientele() {
		return ListesClientele;
	}
	public void setListesClientele(List<Clientele> listesClientele) {
		ListesClientele = listesClientele;
	}
	public List<Livre> getListesLivre() {
		return ListesLivre;
	}
	public void setListesLivre(List<Livre> listesLivre) {
		ListesLivre = listesLivre;
	}
	
	
	
	
	
	
	
}
