package com.example.findfreelance.domains.entreprise;

import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@RestController
@RequestMapping("/entreprise")
public class EntrepriseController {

    private final EntrepriseService service;

    @PostMapping("/add")
    public Entreprise addEntreprise(@RequestBody Entreprise entreprise) {
        return service.addEntreprise(entreprise);
    }

    @GetMapping("/get/all")
    public List<Entreprise> getAllEntreprises() {
        return service.getAllEntreprises();
    }

    @PutMapping("/update/{id}")
    public Entreprise updateEntreprise(@PathVariable Long id, @RequestBody Entreprise entreprise) {
        return service.updateEntreprise(id, entreprise);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEntreprise(@PathVariable Long id) {
        service.deleteEntreprise(id);
    }
}
