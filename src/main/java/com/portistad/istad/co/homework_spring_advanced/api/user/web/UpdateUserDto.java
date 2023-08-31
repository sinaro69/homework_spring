package com.portistad.istad.co.homework_spring_advanced.api.user.web;

import com.SpringFrameworkHomeworkInstruction.Spring.api.userAccount.UserAccount;
import com.SpringFrameworkHomeworkInstruction.Spring.api.userRole.UserRole;
import lombok.Builder;

import java.util.List;
@Builder
public record UpdateUserDto(
String uuid,
        String name,
        String password,
        String email,
        String phoneNumber,
        Boolean isDelete,
        Boolean isStudent,
        Boolean isVerified

) {
}
