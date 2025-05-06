package com.kramekk1.loyalty_program_project.repository;

import com.kramekk1.loyalty_program_project.model.EarningRule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EarningRuleRepository extends JpaRepository<EarningRule, Long> {
}
