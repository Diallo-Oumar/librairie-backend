package com.api.services;

import java.util.List;

import com.api.dto.AchatDto;
import com.api.model.Achat;

public interface AchatServices {
	public Achat add(AchatDto achatDto);
	public Achat update(AchatDto achatDto);
	public Achat supprimer(int Id);
	public List<Achat> listEmprunt();
	public Achat getById(int Id);
}
