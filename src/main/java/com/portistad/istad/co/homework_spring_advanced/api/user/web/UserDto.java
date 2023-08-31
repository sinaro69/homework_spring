package com.portistad.istad.co.homework_spring_advanced.api.user.web;


import com.portistad.istad.co.homework_spring_advanced.api.userAccount.UserAccount;
import com.portistad.istad.co.homework_spring_advanced.api.userRole.UserRole;
import lombok.Builder;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import java.util.List;

//@Relation(collectionRelation = "users", itemRelation = "user")
@Builder
public record UserDto(
        Long id,
        String uuid,
        String name,
        String password,
        String email,
        String phoneNumber,
        Boolean isDelete,
        Boolean isStudent,
        Boolean isVerified,
        List<UserAccount> userAccounts,
        List<UserRole> userRoles
) {
}
