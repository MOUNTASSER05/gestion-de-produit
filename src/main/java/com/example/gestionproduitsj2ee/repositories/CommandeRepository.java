package com.example.gestionproduitsj2ee.repositories;

import com.example.gestionproduitsj2ee.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Long> {

}
