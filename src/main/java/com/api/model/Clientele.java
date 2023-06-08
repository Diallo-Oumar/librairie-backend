package com.api.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Clientele {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int Id;
@ManyToOne
@JoinColumn(name="Id_librairie")
private Librairie librairie;
@ManyToOne
@JoinColumn(name="Id_utulisateur")
private Utulisateur utulisateur;


public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public Librairie getLibrairie() {
	return librairie;
}
public void setLibrairie(Librairie librairie) {
	this.librairie = librairie;
}
public Utulisateur getUtulisateur() {
	return utulisateur;
}
public void setUtulisateur(Utulisateur utulisateur) {
	this.utulisateur = utulisateur;
}


	
	
	
}
