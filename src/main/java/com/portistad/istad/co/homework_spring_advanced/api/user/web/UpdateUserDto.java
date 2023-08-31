package com.portistad.istad.co.homework_spring_advanced.api.user.web;


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
