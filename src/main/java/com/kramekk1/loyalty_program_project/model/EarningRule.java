package com.kramekk1.loyalty_program_project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EarningRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String description;
    private EarningEventType eventType;

    @Min(1)
    private int points;
    private boolean activeStatus;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "program_id", referencedColumnName = "id")
    private LoyaltyProgram program;

    @OneToMany(mappedBy = "earningRule")
    private List<PointsTransaction> pointsTransactions;
}
