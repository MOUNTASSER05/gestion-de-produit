//package com.example.gestionproduitsj2ee.controller;
//
//import com.example.gestionproduitsj2ee.entities.Commande;
//import com.example.gestionproduitsj2ee.repositories.CommandeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.ui.Model;
//
//import java.util.List;
//
//@Controller
//public class CommandeController {
//    @Autowired
//    CommandeRepository commandeRepository;
//
//    @GetMapping("/commandes")
//    public String allCommandes(Model model) {
//        List<Commande> commandes = commandeRepository.findAll();
//        model.addAttribute("commandes", commandes);
//        return "commandes";
//    }
//
//    @GetMapping("/commandes/{id}")
//    public String getCommande(@PathVariable Long id, Model model) {
//        Commande commande = commandeRepository.findById(id)
//                .orElseThrow(() -> new IllegalArgumentException("Invalid commande id: " + id));
//        model.addAttribute("commande", commande);
//        return "commande";
//    }
//
//    @GetMapping("/commandes/new")
//    public String newCommande(Model model) {
//        Commande commande = new Commande();
//        model.addAttribute("commande", commande);
//        return "ajouter-categorie";
//    }
//
//    @PostMapping("/commandes")
//    public String saveCommande(@ModelAttribute("commande") Commande commande) {
//        commandeRepository.save(commande);
//        return "redirect:/commandes";
//    }
//
//    @GetMapping("/commandes/{id}/edit")
//    public String editCommande(@PathVariable Long id, Model model) {
//        Commande commande = commandeRepository.findById(id)
//                .orElseThrow(() -> new IllegalArgumentException("Invalid commande id: " + id));
//        model.addAttribute("commande", commande);
//        return "edit-commande";
//    }
//
//    @PostMapping("/commandes/{id}")
//    public String updateCommande(@PathVariable Long id, @ModelAttribute("commande") Commande commande) {
//        commande.setId(id);
//        commandeRepository.save(commande);
//        return "redirect:/commandes";
//    }
//
//    @GetMapping("/commandes/{id}/delete")
//    public String deleteCommande(@PathVariable Long id) {
//        commandeRepository.deleteById(id);
//        return "redirect:/commandes";
//    }
//}
//
//
