package com.fst.srt.controller;

// import java.util.ArrayList;
// import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.fst.srt.entities.Client;

import static com.fst.srt.DemoApplication.clients;

@Controller
@RequestMapping("/fournisseur")
public class FournisseurController {

    private int dernierIdClient = 0; 

    @GetMapping("/produit")
    public String info(Model model) {
        // ... (votre code actuel)

        model.addAttribute("clients", clients);
        return "data.html";
    }

    @GetMapping("/client")
    public String publier() {
        return "client.html";
    }

    @PostMapping("/client")
    public String ajouter(@RequestParam("nom") String nom, @RequestParam("prenom") String prenom,
                          @RequestParam("email") String email) {

        // Incrémente l'ID pour le nouveau client
        dernierIdClient++;

        // Crée un nouvel objet Client avec un ID unique
        Client c = new Client(dernierIdClient, nom, prenom, email);

        // Ajoute le nouvel objet Client à la liste
        clients.add(c);

        // Redirection vers le point de terminaison "produit" après l'ajout du client
        return "redirect:produit";
    }
}
