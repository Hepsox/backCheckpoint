package com.example.findfreelance.domains.entreprise;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {
}
