package com.example.gestionproduitsj2ee.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String description;

    @OneToMany(mappedBy = "categorie")
    private List<Produit> produits;
}

