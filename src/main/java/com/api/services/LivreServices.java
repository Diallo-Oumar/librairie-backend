package com.api.services;

import java.util.List;

import com.api.dto.LivreDto;

public interface LivreServices {

	public LivreDto add(LivreDto livreDto);
	public LivreDto update(LivreDto livreDto, int id);
	public LivreDto supprimer(int id);
	public List<LivreDto> listeLivre();
	public LivreDto getById(int Id);
}
