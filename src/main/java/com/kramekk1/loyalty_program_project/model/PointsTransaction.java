package com.kramekk1.loyalty_program_project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PointsTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private TransactionType transactionType;
    private int pointsDifference;
    @NotNull
    private String description;
    private LocalDateTime registerAt;
    private int pointsAmountAfterTransaction;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "membership_id", referencedColumnName = "id")
    private Membership membership;

    @ManyToOne
    @JoinColumn(name = "reward_id", referencedColumnName = "id")
    private Reward reward;

    @ManyToOne
    @JoinColumn(name = "earn_rule_id", referencedColumnName = "id")
    private EarningRule earningRule;

    @PrePersist
    private void createTime() {
        this.registerAt = LocalDateTime.now();
    }
}
