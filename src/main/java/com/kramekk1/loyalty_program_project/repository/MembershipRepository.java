package com.kramekk1.loyalty_program_project.repository;

import com.kramekk1.loyalty_program_project.model.Membership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipRepository extends JpaRepository<Membership, Long> {
}
