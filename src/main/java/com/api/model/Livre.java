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
public class Livre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int Id;
private String nom;
private String intitule;
private int nombre_page;
private int qte_stock;
private String auteur;
private String maison_edition;
private Date date_publication;


@ManyToOne
@JoinColumn(name="Id_librairie")
private Librairie librairie;
@OneToMany(mappedBy = "livre")
private List<Emprunt> ListesEmprunt;
@OneToMany(mappedBy = "livre")
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

public Librairie getLibrairie() {
	return librairie;
}
public void setLibrairie(Librairie librairie) {
	this.librairie = librairie;
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