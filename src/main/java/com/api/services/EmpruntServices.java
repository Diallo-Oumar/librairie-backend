package com.api.services;

import java.util.List;

import com.api.dto.EmpruntDto;
import com.api.model.Emprunt;

public interface EmpruntServices {
public Emprunt add(EmpruntDto empruntDto);
public Emprunt update(EmpruntDto empruntDto);
public Emprunt supprimer(int Id);
public List<Emprunt> listEmprunt();
public Emprunt getById(int Id);

}
