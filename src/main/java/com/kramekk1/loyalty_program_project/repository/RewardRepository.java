package com.kramekk1.loyalty_program_project.repository;

import com.kramekk1.loyalty_program_project.model.Reward;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RewardRepository extends JpaRepository<Reward, Long> {
}
