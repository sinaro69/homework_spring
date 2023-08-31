package com.portistad.istad.co.homework_spring_advanced.api.userRole;


import com.portistad.istad.co.homework_spring_advanced.api.role.Role;
import com.portistad.istad.co.homework_spring_advanced.api.user.User;
import com.portistad.istad.co.homework_spring_advanced.base.AuditEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_roles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRole extends AuditEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Role role;
}
