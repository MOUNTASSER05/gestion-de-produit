package com.example.gestionproduitsj2ee.repositories;

import com.example.gestionproduitsj2ee.entities.Categorie;
import com.example.gestionproduitsj2ee.entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
    Page<Categorie> findByNomContaining(String name, Pageable pageable);

}
