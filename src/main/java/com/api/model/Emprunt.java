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
public class Emprunt {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private int nbre_emprunt;
	private int delai_emprunt;
	private Date date_emprunt;
	private int prix_emprunt;
	
	@ManyToOne
	@JoinColumn(name="Id_livre")
	private Livre livre;
	@ManyToOne
	@JoinColumn(name="Id_utulisateur")
	private Utulisateur utulisateur;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getNbre_emprunt() {
		return nbre_emprunt;
	}
	public void setNbre_emprunt(int nbre_emprunt) {
		this.nbre_emprunt = nbre_emprunt;
	}
	public int getDelai_emprunt() {
		return delai_emprunt;
	}
	public void setDelai_emprunt(int delai_emprunt) {
		this.delai_emprunt = delai_emprunt;
	}
	public Date getDate_emprunt() {
		return date_emprunt;
	}
	public void setDate_emprunt(Date date_emprunt) {
		this.date_emprunt = date_emprunt;
	}
	public int getPrix_emprunt() {
		return prix_emprunt;
	}
	public void setPrix_emprunt(int prix_emprunt) {
		this.prix_emprunt = prix_emprunt;
	}
	public Livre getLivre() {
		return livre;
	}
	public void setLivre(Livre livre) {
		this.livre = livre;
	}
	public Utulisateur getUtulisateur() {
		return utulisateur;
	}
	public void setUtulisateur(Utulisateur utulisateur) {
		this.utulisateur = utulisateur;
	}
	
	

	
}