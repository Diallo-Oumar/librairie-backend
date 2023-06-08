package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.model.Livre;

public interface LivreRepository extends JpaRepository<Livre, Integer> {

}
