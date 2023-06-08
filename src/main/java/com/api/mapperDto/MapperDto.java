package com.api.mapperDto;

import com.api.dto.AchatDto;
import com.api.dto.ClienteleDto;
import com.api.dto.EmpruntDto;
import com.api.dto.LibrairieDto;
import com.api.dto.LivreDto;
import com.api.dto.UtulisateurDto;
import com.api.model.Achat;
import com.api.model.Clientele;
import com.api.model.Emprunt;
import com.api.model.Librairie;
import com.api.model.Livre;
import com.api.model.Utulisateur;

public class MapperDto {
	/*************Utulisateur*************/
	/*public static Utulisateur toUtulisateurDto(UtulisateurDto utulisateurDto, Librairie librairie ) {
		Utulisateur utulisateur =new Utulisateur();
		utulisateur.setId(utulisateurDto.getId());
		utulisateur.setNom(utulisateurDto.getNom());
		utulisateur.setPrenom(utulisateurDto.getPrenom());
		utulisateur.setTelephone(utulisateurDto.getTelephone());
		utulisateur.setEmail(utulisateurDto.getEmail());
		utulisateur.setDate_creation(utulisateurDto.getDate_creation());
		utulisateur.setAdresse_location(utulisateurDto.getAdresse_location());
		utulisateur.setIsclient(utulisateurDto.getIsclient());
		utulisateur.setLibrairie(librairie);
		return utulisateur;
	}
	
	public static UtulisateurDto toUtulisateur(Utulisateur utulisateur) {
		UtulisateurDto utulisateurDto=new UtulisateurDto();
		utulisateurDto.setId(utulisateur.getId());
		utulisateurDto.setNom(utulisateur.getNom());
		utulisateurDto.setPrenom(utulisateur.getPrenom());
		utulisateurDto.setTelephone(utulisateur.getTelephone());
		utulisateurDto.setEmail(utulisateur.getEmail());
		utulisateurDto.setDate_creation(utulisateur.getDate_creation());
		utulisateurDto.setAdresse_location(utulisateur.getAdresse_location());
		utulisateurDto.setIsclient(utulisateur.getIsclient());
		utulisateurDto.setId_librairie(utulisateur.getLibrairie().getId());
		
	return utulisateurDto;
	}
	
	*/
	/******************Livre*************************/
	
	public static Livre toLivreDto(LivreDto livreDto, Librairie librairie) {
		Livre livre =new Livre();
		livre.setId(livreDto.getId());
		livre.setNom(livreDto.getNom());
		livre.setIntitule(livreDto.getIntitule());
		livre.setNombre_page(livreDto.getNombre_page());
		livre.setQte_stock(livreDto.getQte_stock());
		livre.setAuteur(livreDto.getAuteur());
		livre.setMaison_edition(livreDto.getMaison_edition());
		livre.setDate_publication(livreDto.getDate_publication());
		livre.setLibrairie(librairie);
		return livre;
	}
	 
	public static LivreDto toLivre(Livre livre) {
		LivreDto livreDto=new LivreDto();
		livreDto.setId(livre.getId());
		livreDto.setNom(livre.getNom());
		livreDto.setIntitule(livre.getIntitule());
		livreDto.setNombre_page(livre.getNombre_page());
		livreDto.setQte_stock(livre.getQte_stock());
		livreDto.setAuteur(livre.getAuteur());
		livreDto.setMaison_edition(livre.getMaison_edition());
		livreDto.setDate_publication(livre.getDate_publication());
		livreDto.setId_librairie(livre.getLibrairie().getId());
		return livreDto;
	}
	/******************Librairie*************************/
	/*public static Librairie toLibrairieDto(LibrairieDto librairieDto) {
		Librairie librairie =new Librairie();
		librairie.setId(librairieDto.getId());
		librairie.setNom(librairieDto.getNom());
		librairie.setSlogan(librairieDto.getSlogan());
		librairie.setEmplacement(librairieDto.getEmplacement());
		
		
	}
	*/

}
