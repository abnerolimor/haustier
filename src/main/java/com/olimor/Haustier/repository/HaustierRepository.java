package com.olimor.Haustier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olimor.Haustier.modelo.Haustier;

public interface HaustierRepository extends JpaRepository<Haustier, Long> {
    
}
