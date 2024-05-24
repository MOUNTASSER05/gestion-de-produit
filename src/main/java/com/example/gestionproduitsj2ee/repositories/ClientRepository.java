package com.example.gestionproduitsj2ee.repositories;

import com.example.gestionproduitsj2ee.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}

