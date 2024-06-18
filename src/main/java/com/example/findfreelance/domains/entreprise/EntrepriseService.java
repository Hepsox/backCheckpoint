package com.example.findfreelance.domains.entreprise;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class EntrepriseService {
    private final EntrepriseRepository repository;

    public Entreprise addEntreprise(Entreprise entreprise) {
        return repository.save(entreprise);
    }

    public List<Entreprise> getAllEntreprises() {
        return repository.findAll();
    }

    public Entreprise updateEntreprise(Long id, Entreprise entreprise) {
        Entreprise entrepriseToUpdate = repository.findById(id).orElseThrow();

        entrepriseToUpdate.setEmail(entreprise.getEmail());
        entrepriseToUpdate.setName(entreprise.getName());
        entrepriseToUpdate.setPassword(entreprise.getPassword());

        return repository.save(entrepriseToUpdate);
    }

    public void deleteEntreprise(Long id) {
        repository.deleteById(id);
    }
}
