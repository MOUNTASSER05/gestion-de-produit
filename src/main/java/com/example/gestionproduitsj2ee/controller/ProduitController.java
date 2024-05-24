//package com.example.gestionproduitsj2ee.controller;
//import com.example.gestionproduitsj2ee.entities.Produit;
//import com.example.gestionproduitsj2ee.repositories.ProduitRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.ui.Model;
//
//import java.util.NoSuchElementException;
//
//@Controller
//public class ProduitController {
//    @Autowired
//    ProduitRepository produitRepository;
//
//    public ProduitController() {
//    }
//
//    @GetMapping(
//            path = {"/index"}
//    )
//    public String allProduits(Model model, @RequestParam(name = "page",defaultValue = "0") int page, @RequestParam(name = "size",defaultValue = "3") int size, @RequestParam(name = "search",defaultValue = "") String searchName) {
//        Page<Produit> pageProduits = this.produitRepository.findByNomContains(searchName, PageRequest.of(page, size));
//        int[] pages = new int[pageProduits.getTotalPages()];
//
//        for(int i = 0; i < pages.length; pages[i] = i++) {
//        }
//
//        model.addAttribute("pageProduits", pageProduits.getContent());
//        model.addAttribute("tabPages", pages);
//        model.addAttribute("size", size);
//        model.addAttribute("currentPage", page);
//        model.addAttribute("searchName", searchName);
//        return "produits";
//    }
//
//    @GetMapping(
//            path = {"/create"}
//    )
//    public String createProduit(Model model) {
//        Produit produit = new Produit();
//        model.addAttribute("produit", produit);
//        return "formAddProduit";
//    }
//
//    @PostMapping(
//            path = {"/save"}
//    )
//    public String saveProduit(Model model, Produit s, @RequestParam(name = "currentPage",defaultValue = "0") int page, @RequestParam(name = "size",defaultValue = "3") int size, @RequestParam(name = "searchName",defaultValue = "") String search) {
//        this.produitRepository.save(s);
//        return "redirect:/index?page=" + page + "&size=" + size + "&search=" + search;
//    }
//
//    @GetMapping(
//            path = {"/"}
//    )
//    public String homePage() {
//        return "/menu";
//    }
//
//    @GetMapping(
//            path = {"/delete"}
//    )
//    public String deleteProduit(int page, int size, String search, @RequestParam(name = "id") Long id) {
//        this.produitRepository.deleteById(id);
//        return "redirect:/index?page=" + page + "&size=" + size + "&search=" + search;
//    }
//
//    @GetMapping(
//            path = {"/edit"}
//    )
//    public String editProduit(Model model, int page, int size, String search, Long id) {
//        Produit produit = (Produit) this.produitRepository.findById(id).orElse((Produit) null);
//        if (produit == null) {
//            throw new RuntimeException("Erreur");
//        } else {
//            model.addAttribute("produit", produit);
//            model.addAttribute("size", size);
//            model.addAttribute("currentPage", page);
//            model.addAttribute("searchName", search);
//            return "formEditProduit";
//        }
//    }
//}
//
