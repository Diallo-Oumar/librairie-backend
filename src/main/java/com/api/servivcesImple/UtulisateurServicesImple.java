package com.api.servivcesImple;

import java.util.List;

import com.api.dto.UtulisateurDto;
import com.api.model.Utulisateur;
import com.api.services.UtulisateurServices;

public class UtulisateurServicesImple implements UtulisateurServices {

	@Override
	public Utulisateur add(UtulisateurDto utulisateurDto) {
		Utulisateur response=new Utulisateur();
		if(response.getIsclient()==true) {
			
		}
		return null;
	}

	@Override
	public Utulisateur update(UtulisateurDto utulisateurDto, int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utulisateur supprimer(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Utulisateur> listUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utulisateur getById(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
