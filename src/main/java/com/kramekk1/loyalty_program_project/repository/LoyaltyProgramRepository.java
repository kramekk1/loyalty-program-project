package com.kramekk1.loyalty_program_project.repository;

import com.kramekk1.loyalty_program_project.model.LoyaltyProgram;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoyaltyProgramRepository extends JpaRepository<LoyaltyProgram, Long> {
}
