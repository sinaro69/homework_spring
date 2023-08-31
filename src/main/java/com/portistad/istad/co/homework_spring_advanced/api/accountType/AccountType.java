package com.portistad.istad.co.homework_spring_advanced.api.accountType;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "account_types")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class AccountType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

}
