package com.example.findfreelance.domains.freelance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FreelanceRepository extends JpaRepository<Freelance, Long> {
}
