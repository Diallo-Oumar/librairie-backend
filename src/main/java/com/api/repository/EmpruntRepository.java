package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.model.Emprunt;

public interface EmpruntRepository extends JpaRepository<Emprunt, Integer> {

}
