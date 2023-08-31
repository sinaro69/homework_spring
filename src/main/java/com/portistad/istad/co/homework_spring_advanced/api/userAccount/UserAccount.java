package com.portistad.istad.co.homework_spring_advanced.api.userAccount;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.portistad.istad.co.homework_spring_advanced.api.account.Account;
import com.portistad.istad.co.homework_spring_advanced.api.user.User;
import com.portistad.istad.co.homework_spring_advanced.base.AuditEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_accounts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserAccount extends AuditEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "is_disabled")
    private Boolean isDisabled;

    @ManyToOne
    @JsonIgnore
    private User user;
    @ManyToOne
    @JsonIgnore
    private Account account;
}
