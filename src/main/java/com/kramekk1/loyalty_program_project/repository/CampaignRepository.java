package com.kramekk1.loyalty_program_project.repository;

import com.kramekk1.loyalty_program_project.model.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepository extends JpaRepository<Campaign, Long> {
}
