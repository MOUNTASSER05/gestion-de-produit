package com.example.gestionproduitsj2ee;

import com.example.gestionproduitsj2ee.repositories.CategorieRepository;
import com.example.gestionproduitsj2ee.repositories.ClientRepository;
import com.example.gestionproduitsj2ee.repositories.ProduitRepository;
import com.example.gestionproduitsj2ee.repositories.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionProduitsJ2EeApplication implements CommandLineRunner {
    @Autowired
    ProduitRepository produitRepository;
    @Autowired
    ClientRepository clientRepository;
    @Autowired
    CategorieRepository categorieRepository;
    @Autowired
    CommandeRepository commandeRepository;

    public static void main(String[] args) {
        SpringApplication.run(GestionProduitsJ2EeApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {

    }

}
