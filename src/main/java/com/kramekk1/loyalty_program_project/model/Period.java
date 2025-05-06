package com.kramekk1.loyalty_program_project.model;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Future;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Period {
    private LocalDateTime startAt;
    @Future
    private LocalDateTime endAt;

    public boolean isNowActive() {
        LocalDateTime now = LocalDateTime.now();
        return startAt.isBefore(now) && endAt.isAfter(now) || endAt == null;
    }
}
