package com.kramekk1.loyalty_program_project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @Embedded
    private Period activeTime;

    private BonusType bonusType;

    private EarningEventType targetEventType;
    private EarningRule earningRule;

    @ManyToOne
    @JoinColumn(name = "loyalty_program_id", referencedColumnName = "id")
    private LoyaltyProgram program;
}
