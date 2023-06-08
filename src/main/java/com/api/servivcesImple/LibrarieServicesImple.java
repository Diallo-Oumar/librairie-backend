package com.api.servivcesImple;

import java.util.List;

import com.api.dto.LibrairieDto;
import com.api.exception.Exception;
import com.api.mapperDto.MapperDto;
import com.api.model.Librairie;
import com.api.model.Livre;
import com.api.services.LibrarieServices;

public class LibrarieServicesImple implements LibrarieServices{

	@Override
	public Librairie add(LibrairieDto librairieDto) {
		/**LibrairieDto response =new LibrairieDto();
		if(librairieDto == null) {
			response.setCode(Exception.error);
			response.setMessage("Veuillez reinseigner le champ");
	
			return response;		
		}
				
	 	Livre livre = MapperDto.toLivreDto(livreDto, librairie.get());
Livre livreSave = livreRepository.save(livre);
response = MapperDto.toLivre(livreSave);
response.setCode(Exception.succes);
response.setMessage("Enregistrement effectuer avec success");
return response;
	 				
		Librairie librairie =MapperDto.toLibrairieDto(librairieDto);
		**/
		return null;
	}

	@Override
	public Librairie update(LibrairieDto librairieDto, int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Librairie supprimer(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Librairie> listLibrairie() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Librairie getById(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
