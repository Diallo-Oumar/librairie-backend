package com.api.dto;

import java.util.Date;

public class LivreDto extends ResponseDto{
	private int Id;
	private String nom;
	private String intitule;
	private int nombre_page;
	private int qte_stock;
	private String auteur;
	private String maison_edition;
	private Date date_publication;
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
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public int getNombre_page() {
		return nombre_page;
	}
	public void setNombre_page(int nombre_page) {
		this.nombre_page = nombre_page;
	}
	public int getQte_stock() {
		return qte_stock;
	}
	public void setQte_stock(int qte_stock) {
		this.qte_stock = qte_stock;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getMaison_edition() {
		return maison_edition;
	}
	public void setMaison_edition(String maison_edition) {
		this.maison_edition = maison_edition;
	}
	public Date getDate_publication() {
		return date_publication;
	}
	public void setDate_publication(Date date_publication) {
		this.date_publication = date_publication;
	}
	public int getId_librairie() {
		return Id_librairie;
	}
	public void setId_librairie(int id_librairie) {
		Id_librairie = id_librairie;
	}
	
	
	
	
}
