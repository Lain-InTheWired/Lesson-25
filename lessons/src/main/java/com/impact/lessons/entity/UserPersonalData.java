package com.impact.lessons.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "user_personal_data")
@Getter
@Setter

public class UserPersonalData {
    @OneToOne
    @MapsId
    @JoinColumn(name ="user_id")

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
}
