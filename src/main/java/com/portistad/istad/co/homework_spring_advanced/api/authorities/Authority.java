package com.portistad.istad.co.homework_spring_advanced.api.authorities;


import com.portistad.istad.co.homework_spring_advanced.api.role.Role;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "authorities")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "authorities")
    List<Role> roles;
}
