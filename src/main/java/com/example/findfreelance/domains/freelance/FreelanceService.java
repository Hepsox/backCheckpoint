package com.example.findfreelance.domains.freelance;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class FreelanceService {
    private final FreelanceRepository repository;

    public Freelance addFreelance(Freelance freelance) {
        return repository.save(freelance);
    }

    public List<Freelance> getAllFreelances() {
        return repository.findAll();
    }

    public Freelance updateFreelance(Long id, Freelance freelance) {
        Freelance freelanceToUpdate = repository.findById(id).orElseThrow();

        freelanceToUpdate.setFirstname(freelance.getFirstname());
        freelanceToUpdate.setLastname(freelance.getLastname());
        freelanceToUpdate.setPrice(freelance.getPrice());
        freelanceToUpdate.setDescription(freelance.getDescription());
        freelanceToUpdate.setSkills(freelance.getSkills());

        return repository.save(freelanceToUpdate);
    }

    public void deleteFreelance(Long id) {
        repository.deleteById(id);
    }

    public Freelance getFreelance(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
