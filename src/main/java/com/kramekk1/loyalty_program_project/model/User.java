package com.kramekk1.loyalty_program_project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String firstname;
    @NotBlank
    private String surname;
    @Email
    @Column(unique = true)
    private String email;
    private LocalDateTime registerAt;

    @OneToMany(mappedBy= "user", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Membership> memberships;

    @PrePersist
    private void createTime() {
        this.registerAt = LocalDateTime.now();
    }
}
