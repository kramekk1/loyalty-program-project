package com.kramekk1.loyalty_program_project.repository;

import com.kramekk1.loyalty_program_project.model.PointsTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointsTransactionRepository extends JpaRepository<PointsTransaction, Long> {
}
