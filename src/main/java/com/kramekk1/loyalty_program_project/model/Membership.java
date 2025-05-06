package com.kramekk1.loyalty_program_project.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(uniqueConstraints =
        @UniqueConstraint(columnNames = {"user_id", "program_id"})
)
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Membership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "program_id", referencedColumnName = "id")
    private LoyaltyProgram program;

    @OneToMany(mappedBy = "membership")
    private List<PointsTransaction> pointsTransactions;

    private LocalDateTime joinDate;

    private int pointsBalance;
    private ProgramLevel level;

    @PrePersist
    private void createTime() {
        this.joinDate = LocalDateTime.now();
    }
}
