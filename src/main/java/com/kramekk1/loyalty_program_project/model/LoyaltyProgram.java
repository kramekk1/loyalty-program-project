package com.kramekk1.loyalty_program_project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class LoyaltyProgram {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @NotBlank
    private String programName;
    @NotNull
    private String description;
    @Embedded
    private Period period;

    private boolean activeStatus;

    @OneToMany(mappedBy="program", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Membership> members;

    @OneToMany(mappedBy="program", cascade=CascadeType.ALL)
    private List<EarningRule> earningRules;

    @OneToMany(mappedBy="program", cascade=CascadeType.ALL)
    private List<Reward> rewards;

    @OneToMany(mappedBy="program", cascade=CascadeType.ALL)
    private List<Campaign> campaigns;
}
