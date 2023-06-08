package com.api.dto;

import java.util.Date;

public class AchatDto extends ResponseDto{
	private int Id;
	private int prix;
	private int qte_achat;
	private Date date_achat;
	private int Id_livre;
	private int Id_utulisateur;
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
	
}
