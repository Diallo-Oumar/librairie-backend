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
public class Achat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private int prix;
	private int qte_achat;
	private Date date_achat;
		
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
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public int getQte_achat() {
		return qte_achat;
	}
	public void setQte_achat(int qte_achat) {
		this.qte_achat = qte_achat;
	}
	public Date getDate_achat() {
		return date_achat;
	}
	public void setDate_achat(Date date_achat) {
		this.date_achat = date_achat;
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
