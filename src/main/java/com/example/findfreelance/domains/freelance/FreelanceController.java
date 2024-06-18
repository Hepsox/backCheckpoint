package com.example.findfreelance.domains.freelance;

import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@RestController
@RequestMapping("/freelance")
public class FreelanceController {

    private final FreelanceService service;

    @GetMapping("/get/all")
    public List<Freelance> getAllFreelances() {
        return service.getAllFreelances();
    }

    @PostMapping("/add")
    public Freelance addFreelance(@RequestBody Freelance freelance) {
        return service.addFreelance(freelance);
    }

    @GetMapping("/get/{id}")
    public Freelance getFreelance(@PathVariable Long id) {
        return service.getFreelance(id);
    }

    @PutMapping("/update/{id}")
    public Freelance updateFreelance(@PathVariable Long id, @RequestBody Freelance freelance) {
        return service.updateFreelance(id, freelance);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFreelance(@PathVariable Long id) {
        service.deleteFreelance(id);
    }
}
