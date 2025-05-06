package com.kramekk1.loyalty_program_project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Reward {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;
    @NotNull
    private String description;

    @NotNull
    private int pointsCost;
    @NotNull
    private int availableCount;

    @Embedded
    private Period availableTime;

    private boolean activeStatus;

    @ManyToOne
    @JoinColumn(name = "program_id", referencedColumnName = "id")
    private LoyaltyProgram program;

    @OneToMany(mappedBy = "reward")
    private List<PointsTransaction> pointsTransactions;
}
