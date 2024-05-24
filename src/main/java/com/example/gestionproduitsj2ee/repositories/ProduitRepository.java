package com.example.gestionproduitsj2ee.repositories;

import com.example.gestionproduitsj2ee.entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
    List<Produit> findByNom(String name);

    List<Produit> findByNomContains(String name);

    Page<Produit> findByNomContains(String name, PageRequest pageable);
}
