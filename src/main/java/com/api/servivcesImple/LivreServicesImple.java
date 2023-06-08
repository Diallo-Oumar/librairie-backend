package com.api.servivcesImple;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.dto.LivreDto;
import com.api.exception.Exception;
import com.api.mapperDto.MapperDto;
import com.api.model.Achat;
import com.api.model.Emprunt;
import com.api.model.Librairie;
import com.api.model.Livre;
import com.api.repository.AchatRepository;
import com.api.repository.EmpruntRepository;
import com.api.repository.LibrairieRepository;
import com.api.repository.LivreRepository;
import com.api.services.LivreServices;

@Service
public class LivreServicesImple implements LivreServices {
	
	@Autowired
	private LivreRepository livreRepository;
	
	@Autowired
	private LibrairieRepository librairieRepository;

	@Override
	public LivreDto add(LivreDto livreDto) {
		LivreDto response = new LivreDto();
		if(livreDto == null) {
			response.setCode(Exception.error);
			response.setMessage("Veuillez le champ");
			return response;
		}
		Optional<Librairie> librairie = librairieRepository.findById(livreDto.getId_librairie());
		if(!librairie.isPresent()) {
			response.setCode(Exception.error);
			response.setMessage("Cette librairie n'existe pas");
			return response;
		}
		/*Optional<Emprunt> empruntOptional = empruntRepository.findById(livreDto.getId_emprunt());
		if(!empruntOptional.isPresent()) {
			response.setCode(Exception.error);
			response.setMessage("Cet emprunt n'existe pas");
			return response;
		}
		Optional<Achat> achatOptional = achatRepository.findById(livreDto.getId_achat());
		if(!achatOptional.isPresent()) {
			response.setCode(Exception.error);
			response.setMessage("Cet achat n'existe pas");
			return response;
		}*/
		Livre livre = MapperDto.toLivreDto(livreDto, librairie.get());
		Livre livreSave = livreRepository.save(livre);
		response = MapperDto.toLivre(livreSave);
		response.setCode(Exception.succes);
		response.setMessage("Enregistrement effectuer avec success");
		return response;
	}

	@Override
	public LivreDto update(LivreDto livreDto, int id) {
		LivreDto response = new LivreDto();
		if(livreDto == null || id == 0) {
			response.setCode(Exception.error);
			response.setMessage("Veuillez renseigner les champs");
			return response;
		}
		Optional<Livre> livreOptional = livreRepository.findById(id);
		if(!livreOptional.isPresent()) {
			response.setCode(Exception.error);
			response.setMessage("Ce livre n'existe pas");
			return response;
		}
		Optional<Librairie> librairie = librairieRepository.findById(livreDto.getId_librairie());
		if(!librairie.isPresent()) {
			response.setCode(Exception.error);
			response.setMessage("Cette librairie n'existe pas");
			return response;
		}
		livreDto.setId(id);
		Livre livre = MapperDto.toLivreDto(livreDto, librairie.get());
		Livre livreSave = livreRepository.save(livre);
		response = MapperDto.toLivre(livreSave);
		response.setCode(Exception.succes);
		response.setMessage("Modification effectuée avec success");
		return response;
	}

	@Override
	public LivreDto supprimer(int id) {
		LivreDto response = new LivreDto();
		if(id == 0) {
			response.setCode(Exception.error);
			response.setMessage("L'identifiant ne doit pas etre nul");
			return response;
		}
		Optional<Livre> livre = livreRepository.findById(id);
		if(!livre.isPresent()) {
			response.setCode(Exception.error);
			response.setMessage("Cette Livre n'existe pas");
			return response;
		}
		livreRepository.deleteById(id);
		response.setCode(Exception.succes);
		response.setMessage("Suppression effectuer avec succes");
		return response;
	}

	@Override
	public List<LivreDto> listeLivre() {
		List<Livre> listelivre = livreRepository.findAll();
		List<LivreDto> livreDto = new ArrayList<>();
		listelivre.forEach(val->{
			livreDto.add(MapperDto.toLivre(val));
		});
		return listeLivre();
	}

	@Override
	public LivreDto getById(int Id) {
		LivreDto response = new LivreDto();
		if(Id == 0) {
			response.setCode(Exception.error);
			response.setMessage("L'identifiant ne doit pas etre nul");
			return response;
		}
		Optional<Livre> livre = livreRepository.findById(Id);
		if(!livre.isPresent()) {
			response.setCode(Exception.error);
			response.setMessage("Cette Livre n'existe pas");
			return response;
		}
		Optional<Livre> enseignant = livreRepository.findById(Id);
		return MapperDto.toLivre(enseignant.get());
	}

}
