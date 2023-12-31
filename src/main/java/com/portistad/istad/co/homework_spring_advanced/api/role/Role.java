package com.portistad.istad.co.homework_spring_advanced.api.role;


import com.portistad.istad.co.homework_spring_advanced.api.authorities.Authority;
import com.portistad.istad.co.homework_spring_advanced.api.userRole.UserRole;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "roles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "role")
    List<UserRole> userRoles;

    @ManyToMany
    @JoinTable(name = "roles_authorities",
            joinColumns=@JoinColumn(name = "role_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "authorities_id",referencedColumnName = "id")
    )
    private List<Authority> authorities ;
}
