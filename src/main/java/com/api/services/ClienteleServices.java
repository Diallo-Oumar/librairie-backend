package com.api.services;

import java.util.List;

import com.api.dto.ClienteleDto;
import com.api.model.Clientele;



public interface ClienteleServices {
	public Clientele add(ClienteleDto clienteleDto);
	public Clientele update(ClienteleDto clienteleDto);
	public Clientele supprimer(int Id);
	public List<Clientele> listEmprunt();
	public Clientele getById(int Id);
}
