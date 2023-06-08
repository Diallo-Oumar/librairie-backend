package com.api.dto;

import java.util.Date;

public class EmpruntDto {
	private int Id;
	private int nbre_emprunt;
	private int delai_emprunt;
	private Date date_emprunt;
	private int prix_emprunt;
	private int Id_livre;
	private int Id_utulisateur;
	public int getId_livre() {
		return Id_livre;
	}
	public void setId_livre(int id_livre) {
		Id_livre = id_livre;
	}
	public int getId_utulisateur() {
		return Id_utulisateur;
	}
	public void setId_utulisateur(int id_utulisateur) {
		Id_utulisateur = id_utulisateur;
	}
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
}
