package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.dto.LivreDto;
import com.api.servivcesImple.LivreServicesImple;

@RestController
public class LivreController {
	
	@Autowired
	private LivreServicesImple livreSerImple;

	@PostMapping("/livre")
	public LivreDto add(@RequestBody LivreDto dto) {
		return livreSerImple.add(dto);
	}
	
	@PutMapping("/livre/modfier/{id}")
	public LivreDto update(@RequestBody LivreDto dto, @PathVariable int id) {
		return livreSerImple.update(dto, id);
	}
	
	@DeleteMapping("/livre/supprimer/{id}")
	public LivreDto supprimer(@PathVariable int id) {
		return livreSerImple.supprimer(id);
	}
	
	@GetMapping("/livre/liste")
	public List<LivreDto> livreListe(){
		return livreSerImple.listeLivre();
	}
	
	@GetMapping("livre/getById/{id}")
	public LivreDto getById(@PathVariable int id) {
		return livreSerImple.getById(id);
	}
}
