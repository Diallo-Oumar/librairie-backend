package com.api.services;

import java.util.List;

import com.api.dto.LibrairieDto;
import com.api.model.Librairie;

public interface LibrarieServices {
public Librairie add(LibrairieDto librairieDto);
public Librairie update(LibrairieDto librairieDto,int Id);
public Librairie supprimer(int Id);
public List<Librairie> listLibrairie();
public Librairie getById(int Id);
}
