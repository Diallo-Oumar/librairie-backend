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
	public static Utulisateur toUtulisateurDto(UtulisateurDto utulisateurDto, Librairie librairie ) {
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
	public static Librairie toLibrairieDto(LibrairieDto librairieDto) {
		Librairie librairie =new Librairie();
		librairie.setId(librairieDto.getId());
		librairie.setNom(librairieDto.getNom());
		librairie.setSlogan(librairieDto.getSlogan());
		librairie.setEmplacement(librairieDto.getEmplacement());
		
		return librairie;
		}
	public static LibrairieDto toLibrairie(Librairie librairie) {
		LibrairieDto librairieDto=new LibrairieDto();
		librairieDto.setId(librairie.getId());
		librairieDto.setNom(librairie.getNom());
		librairieDto.setSlogan(librairie.getSlogan());
		librairieDto.setEmplacement(librairie.getEmplacement());
		
		return librairieDto;
	}
	
	/******************Emprunt*************************/
	
	
	public static Emprunt toEmpruntDto(EmpruntDto empruntDto, Utulisateur utulisateur,Livre livre) {
		Emprunt emprunt =new Emprunt();
		emprunt.setId(empruntDto.getId());
		emprunt.setNbre_emprunt(empruntDto.getNbre_emprunt());
		emprunt.setDelai_emprunt(empruntDto.getDelai_emprunt());
		emprunt.setDate_emprunt(empruntDto.getDate_emprunt());
		emprunt.setPrix_emprunt(empruntDto.getPrix_emprunt());
		emprunt.setUtulisateur(utulisateur);
		emprunt.setLivre(livre);
		
		return emprunt;
	}
	
	public static EmpruntDto toEmprunt(Emprunt emprunt) {
		EmpruntDto empruntDto =new EmpruntDto();
		empruntDto.setId(emprunt.getId());
		empruntDto.setNbre_emprunt(emprunt.getNbre_emprunt());
		empruntDto.setDelai_emprunt(emprunt.getDelai_emprunt());
		empruntDto.setDate_emprunt(emprunt.getDate_emprunt());
		empruntDto.setPrix_emprunt(emprunt.getPrix_emprunt());
		empruntDto.setId_utulisateur(emprunt.getUtulisateur().getId());
		empruntDto.setId_livre(emprunt.getLivre().getId());
	return empruntDto;	
	}
	/******************Achat*************************/
	
	public static Achat toAchatDto(AchatDto achatDto, Utulisateur utulisateur,Livre livre) {
		Achat achat =new Achat();
		achat.setId(achatDto.getId());
		achat.setPrix(achatDto.getPrix());
		achat.setQte_achat(achatDto.getQte_achat());
		achat.setDate_achat(achatDto.getDate_achat());
		achat.setUtulisateur(utulisateur);
		achat.setLivre(livre);
		
		return achat;
	}
	public static AchatDto toAchat(Achat achat) {
		AchatDto achatDto =new AchatDto();
		achatDto.setId(achat.getId());
		achatDto.setPrix(achat.getPrix());
		achatDto.setQte_achat(achat.getQte_achat());
		achatDto.setDate_achat(achat.getDate_achat());
		achatDto.setId_utulisateur(achat.getUtulisateur().getId());
		achatDto.setId_livre(achat.getLivre().getId());
		
		return achatDto;
	}
	/******************Clientele*************************/
	
	public static Clientele toClienteleDto(ClienteleDto clienteleDto,Utulisateur utulisateur,Librairie librairie) {
		
		Clientele clientele=new Clientele();
		clientele.setId(clienteleDto.getId());
		clientele.setUtulisateur(utulisateur);
		clientele.setLibrairie(librairie);
		
		return clientele;
	}
	public static ClienteleDto toClientele(Clientele clientele) {
		
		ClienteleDto clienteleDto=new ClienteleDto();
		clienteleDto.setId(clientele.getId());
		clienteleDto.setId_utulisateur(clientele.getUtulisateur().getId());
		clienteleDto.setId_librairie(clientele.getLibrairie().getId());
		
		return clienteleDto;
		
		
	}
	
	
	
	
	
	
}
