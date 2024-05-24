//package com.example.gestionproduitsj2ee.controller;
//import com.example.gestionproduitsj2ee.entities.Categorie;
//import com.example.gestionproduitsj2ee.repositories.CategorieRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.ui.Model;
//
//import java.util.List;
//@Controller
//@RequestMapping("/categories")
//public class CategorieController {
//
//    @Autowired
//    private CategorieRepository categorieRepository;
//
//    @GetMapping("/")
//    public String index(Model model,
//                        @RequestParam(defaultValue = "1") int page,
//                        @RequestParam(defaultValue = "10") int size,
//                        @RequestParam(defaultValue = "") String search) {
//
//        // Pagination et tri
//        Pageable pageable = PageRequest.of(page - 1, size, Sort.Direction.ASC, "id");
//        Page<Categorie> categories = categorieRepository.findAll(pageable);
//
//        // Recherche par nom
//        if (!search.isEmpty()) {
//            categories = categorieRepository.findByNomContaining(search, pageable);
//        }
//
//        model.addAttribute("categories", categories);
//        return "categories";
//    }
//
//    @GetMapping("/ajouter")
//    public String ajouter(Model model) {
//        model.addAttribute("categorie", new Categorie());
//        return "ajouter-categorie";
//    }
//
//    @PostMapping("/ajouter")
//    public String ajouter(Categorie categorie) {
//        // Validation des champs
//
//        categorieRepository.save(categorie);
//        return "redirect:/categories";
//    }
//
//    @GetMapping("/modifier/{id}")
//    public String modifier(Model model, @PathVariable Long id) {
//        Categorie categorie = categorieRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Catégorie introuvable"));
//        model.addAttribute("categorie", categorie);
//        return "modifier-categorie";
//    }
//
//    @PostMapping("/modifier/{id}")
//    public String modifier(Categorie categorie) {
//        // Validation des champs
//
//        categorieRepository.save(categorie);
//        return "redirect:/categories";
//    }
//
//    @GetMapping("/supprimer/{id}")
//    public String supprimer(@PathVariable Long id) {
//        categorieRepository.deleteById(id);
//        return "redirect:/categories";
//    }
//}
