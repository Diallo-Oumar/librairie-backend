package com.api.services;

import java.util.List;

import com.api.dto.UtulisateurDto;
import com.api.model.Utulisateur;

public interface UtulisateurServices {
public Utulisateur add(UtulisateurDto utulisateurDto);
public Utulisateur update(UtulisateurDto utulisateurDto ,int Id);
public Utulisateur supprimer(int Id);
public List<Utulisateur> listUser();
public Utulisateur getById(int Id);
}
